package 자바25_db;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class study2_조회화면 {

	public static void main(String[] args) {
		JH j = new JH();
	}
}
class JH extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("조회화면");
	Label lbName = new Label("이름:");
	
	TextField tfName = new TextField();
	
	Button btn1 = new Button("검색");
	Button btn2 = new Button("전체검색");
	
	TextArea ta = new TextArea();
	
	JH()
	{
		super("조회화면");
		this.setSize(500,500);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setFont(font30);
		lbTitle.setBounds(50,50,150,50);
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(50,120,70,50);
		
		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(130,120,170,50);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(320,120,100,50);
		this.add(btn2); btn2.setFont(font30);  
		btn2.setBounds(300,200,140,50);
		
		this.add(ta); ta.setFont(font30);  
		ta.setBounds(30,260,440,200);
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
			search(tfName.getText());
		}
		else if(e.getSource() == btn2)
		{
			System.out.println("전체검색");
			searchAll();
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
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, id, pass);
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
		String pass = "qwer";
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from member";
		try {
			conn = DriverManager.getConnection(url, id, pass);
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
}