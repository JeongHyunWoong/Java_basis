package 자바25_db;
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

public class study5_회원수정 {

	public static void main(String[] args) {
		Sj s = new Sj();
	}
}
class Sj extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("회원수정");
	Label lbId = new Label("아이디:");
	Label lbName = new Label("이름:");
	Label lbPw = new Label("비번:");
	Label lbPN = new Label("연락처:");
	Label lbAge = new Label("나이:");
	
	TextField tfId = new TextField();
	TextField tfName = new TextField();
	TextField tfPw = new TextField();
	TextField tfPN = new TextField();
	TextField tfAge = new TextField();
	
	Button btn1 = new Button("검색");
	Button btn2 = new Button("수정완료");
	private Font font30;
	private Label ta;
	private java.sql.Connection dc;
	
	Sj()
	{
		super("회원수정");
		this.setSize(500,600);
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
		lbTitle.setBounds(140,50,250,70);
		
		this.add(lbId); lbId.setFont(font30);
		lbId.setBounds(20,150,120,50);
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(20,220,120,50);
		this.add(lbPw); lbPw.setFont(font30);
		lbPw.setBounds(20,290,120,50);
		this.add(lbPN); lbPN.setFont(font30);
		lbPN.setBounds(20,360,120,50);
		this.add(lbAge); lbAge.setFont(font30);
		lbAge.setBounds(20,430,120,50);
		
		this.add(tfId); tfId.setFont(font30);
		tfId.setBounds(160,150,150,50);
		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(160,220,200,50);
		this.add(tfPw); tfPw.setFont(font30);
		tfPw.setBounds(160,290,200,50);
		this.add(tfPN); tfPN.setFont(font30);
		tfPN.setBounds(160,360,200,50);
		this.add(tfAge); tfAge.setFont(font30);
		tfAge.setBounds(160,430,200,50);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(340,150,100,50);
		this.add(btn2); btn2.setFont(font30);  
		btn2.setBounds(160,500,160,50);
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
		if(e.getSource() == btn1)
		{
			System.out.println("검색대상:"+tfName.getText());
			String id = tfId.getText();
			search(id);
		}
		if(e.getSource() == btn2) 
		{
			String pw = tfPw.getText();
			String name = tfName.getText();
			String hp = tfPN.getText();
			String age = tfAge.getText();
			String id = tfId.getText();
			editMember(id,pw, name, hp, age);
		}
	}
	void search(String id)
	{
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.out.println("드라이브가 연결안됨.");
			System.exit(0);
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";				
		String z = "root";
		String pw = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = (Connection) DriverManager.getConnection(url, z, pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				if(rs.getString(2).equals(id)) {
					tfPw.setText(rs.getString(3));
					tfName.setText(rs.getString(4));
					tfPN.setText(rs.getString(5));
					tfAge.setText(rs.getString(6));
				}
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	public boolean editMember(String id, String pw, String name, String hp, String age) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.out.println("드라이브가 연결안됨.");
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
					+ "useUnicode=true&characterEncoding=utf8";				
		String z = "root";
		String pass = "qwer";
		String query = "update member set pw = ?, name = ?, hp = ?, age = ? where id = ?";
		try {
			conn = (Connection) DriverManager.getConnection(url, z, pass);
			PreparedStatement pstmt =(PreparedStatement) conn.prepareStatement(query);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, hp);
			pstmt.setString(4, age);
			pstmt.setString(5, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException ee) {
			System.err.println("회원 정보수정 실패!!");
			return false;
		}
		return true;
	}
}