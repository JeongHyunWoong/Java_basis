package �ڹ�25_db;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class study3_�α��� {

	public static void main(String[] args) {
		Login l = new Login();
	}
}
class Login extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("�α���");
	Label lbId = new Label("���̵�:");
	Label lbPw = new Label("��й�ȣ:");
	
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	
	Button btn1 = new Button("�α���");
	Button btn2 = new Button("ȸ������");

	private Font font60;
	
	Login()
	{
		super("�α���ȭ��");
		this.setSize(500,800);
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
		lbTitle.setBounds(165,80,250,70);
		
		this.add(lbId); lbId.setFont(font30);
		lbId.setBounds(50,250,140,50);
		this.add(lbPw); lbPw.setFont(font30);
		lbPw.setBounds(50,350,140,50);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(160,480,200,50);
		this.add(btn2); btn2.setFont(font30);  
		btn2.setBounds(160,580,200,50);
		
		this.add(tfId); tfId.setFont(font30);
		tfId.setBounds(200,250,250,50);
		this.add(tfPw); tfPw.setFont(font30);
		tfPw.setBounds(200,350,250,50);
	}
	void start()
	{
		btn1.addActionListener(this);
		btn2.addActionListener(this);
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
		
		if(e.getSource()==btn2) {Member1 m = new Member1();}
		else if(id.equals("")) {msg("���̵��Է����ּ���!"); return;}
		else if(pw.equals("")) {msg("��й�ȣ�� �Է��ϼ���.");return;}
		else if(e.getSource()==btn1) {
			search(id,pw);
			Main m = new Main();
		}
		
	}
	void search(String id, String pw)
	{
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.out.println("����̺갡 ����ȵ�.");
			System.exit(0);
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";				
		String user = "root";
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = (Connection) DriverManager.getConnection(url, user, pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				if(rs.getString(2).equals(id) && rs.getString(3).equals(pw)) //&&:�Ѵ�
				{ }
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	lbMsg.setFont(font60);
		lbMsg.setBounds(100, 100, 250, 60);
		
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