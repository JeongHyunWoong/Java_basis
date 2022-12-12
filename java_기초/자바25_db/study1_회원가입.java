package �ڹ�25_db;
import java.awt.*;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class study1_ȸ������ {

	public static void main(String[] args) {
		Member1 m = new Member1();
	}
}
class Member1 extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("ȸ������");
	Label lbId = new Label("���̵�:");
	Label lbPw = new Label("��й�ȣ:");
	Label lbC = new Label("���Ȯ��:");
	Label lbName = new Label("�̸�:");
	Label lbPN = new Label("����ó:");
	Label lbAge = new Label("����:");
	
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	TextField tfC = new TextField();
	TextField tfName = new TextField();
	TextField tfPN = new TextField();
	TextField tfAge = new TextField();
	
	Button btn1 = new Button("�����ϱ�");
	private Font font30;
	
	Member1()
	{
		super("ȸ������ȭ��");
		this.setSize(500,700);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font50 = new Font("SansSerif", Font.BOLD, 50);
		
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setFont(font50);
		lbTitle.setBounds(150,50,250,70);
		
		this.add(lbId); lbId.setFont(font30);
		lbId.setBounds(20,150,140,50);
		this.add(lbPw); lbPw.setFont(font30);
		lbPw.setBounds(20,220,140,50);
		this.add(lbC); lbC.setFont(font30);
		lbC.setBounds(20,290,140,50);
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(20,360,140,50);
		this.add(lbPN); lbPN.setFont(font30);
		lbPN.setBounds(20,430,140,50);
		this.add(lbAge); lbAge.setFont(font30);
		lbAge.setBounds(20,500,140,50);
		
		this.add(tfId); tfId.setFont(font30);
		tfId.setBounds(180,150,250,50);
		this.add(tfPw); tfPw.setFont(font30);
		tfPw.setBounds(180,220,250,50);
		this.add(tfC); tfC.setFont(font30);
		tfC.setBounds(180,290,250,50);
		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(180,360,250,50);
		this.add(tfPN); tfPN.setFont(font30);
		tfPN.setBounds(180,430,250,50);
		this.add(tfAge); tfAge.setFont(font30);
		tfAge.setBounds(180,500,250,50);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(160,580,130,50);
	}
	void start()
	{
		btn1.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});	
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
	public void actionPerformed(ActionEvent e) {
		String id = tfId.getText();
		String pw = tfPw.getText();
		String C = tfC.getText();
		String name = tfName.getText();
		String PN = tfPN.getText();
		String age = tfAge.getText();
		//����üũ
		if(id.equals("")) {msg("���̵��Է����ּ���!"); return;}
		if(pw.equals("")) {msg("��й�ȣ�� �Է��ϼ���.");return;}
		if(C.equals("")) {msg("��й�ȣ2�� �Է����ּ���!");return;}
		if(name.equals("")) {msg("�̸��� �Է����ּ���!");return;}
		if(PN.equals("")) {msg("����ó���Է����ּ���!");return;}
		if(age.equals("")) {msg("���̸��Է����ּ���!");return;}
		
		if(!pw.equals(C)){msg("����̼��ΰ����ʽ��ϴ�.");return;}
		
		insert(id,pw,name,PN,age);
	}
	void insert(String id,String pw,String name,String hp,String age)
	{
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("����̺갡 �ֽ��ϴ�~! ^_^v");
		} catch (ClassNotFoundException ee) {
			System.out.println("����̺� ����!!");
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";
		String user = "root";// ID
		String password = "qwer";// ��й�ȣ
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ǿ����ϴ�.");
		} catch (SQLException ee) {
			System.err.println("���ᰴü ��������!!");
		}		
		
		String pquery = "insert into member values (null, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		try {			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, hp);	
			pstmt.setString(5, age);
			pstmt.executeUpdate();
			System.out.println("���༺��");
		} catch (SQLException ee) {
			System.err.println("Query ���� Ŭ���� ���� ����~!! : " + ee.toString());
		}

		
		// 5. Close �۾�
		try {			
			pstmt.close();			
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
				conn = null;
			}
		} catch (SQLException ee) {
			System.err.println("�ݱ� ����~!!");
		}
	}
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font30);
		lbMsg.setBounds(100, 100, 250, 30);
		
		dlg.setSize(700, 250);
		dlg.setLocation(600, 400);
		
		dlg.removeWindowFocusListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dlg.setVisible(false);
			}
		});
		dlg.setVisible(true);
	}

}