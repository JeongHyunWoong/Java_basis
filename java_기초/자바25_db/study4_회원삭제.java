package 자바25_db;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class study4_회원삭제 {

	public static void main(String[] args) {
		Delete d = new Delete();
	}
}
class Delete extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("회원삭제");
	Label lbName = new Label("이름:");
	Label lbList = new Label("회원리스트");
	
	TextField tfName = new TextField();
	
	Button btn1 = new Button("검색");
	Button btn2 = new Button("전체보기");
	Button btn3 = new Button("삭제하기");
	
	TextArea ta = new TextArea();
	private Connection dc;
	
	Delete()
	{
		super("회원삭제화면");
		this.setSize(500,700);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font40 = new Font("SansSerif", Font.BOLD, 40);
		
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setFont(font40);
		lbTitle.setBounds(150,50,250,70);
		
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(20,150,140,50);
		this.add(lbList); lbList.setFont(font40);
		lbList.setBounds(30,380,220,50);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(320,150,140,50);
		this.add(btn2); btn2.setFont(font30);  
		btn2.setBounds(320,220,140,50);
		this.add(btn3); btn3.setFont(font30);  
		btn3.setBounds(50,300,300,50);
		
		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(160,150,140,50);
		
		this.add(ta); ta.setFont(font30);
		ta.setBounds(30,450,430,200);
	}
	void start()
	{
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
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
	void delClose()
	{
		this.setVisible(false);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1)
		{
			search(tfName.getText());
		}
		else if(e.getSource() == btn2)
		{
			searchAll();
		}
		else if(e.getSource() == btn3) 
		{
			deleteMember(tfName.getText());
		}
	}
	void search(String name)
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
		String id = "root";
		String pw = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				if(rs.getString(4).equals(name))
				{
					ta.setText(rs.getInt(1) 
					+ " / " + rs.getString(2)
					+ " / " + rs.getString(3)
					+ " / " + rs.getString(4)
					+ " / " + rs.getString(5));
				}
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	void searchAll() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.out.println("드라이브가 연결안됨.");
			System.exit(0);
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";				
		String id = "root";
		String pw = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			String result="";
			while (rs.next()) {
				result += rs.getInt(1) 
				+ " / " + rs.getString(2)
				+ " / " + rs.getString(3)
				+ " / " + rs.getString(4)
				+ " / " + rs.getString(5)+"\n";			
			}
			ta.setText(result);
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}
	public boolean deleteMember(String name) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException ee) {
			System.out.println("드라이브가 연결안됨.");
			System.exit(0);
		}
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?"
				+ "useUnicode=true&characterEncoding=utf8";				
		String id = "root";
		String pw = "qwer";
		String query = "delete from member where name = ?";
		try {
			conn = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException ee) {
			System.err.println("회원 삭제 실패!!");
			return false;
		}
		return true;
	}
}