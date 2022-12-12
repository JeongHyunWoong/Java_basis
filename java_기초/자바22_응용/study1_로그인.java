package 자바22_응용;
import java.awt.*;

public class study1_로그인 {

	public static void main(String[] args) {
		Login l = new Login();
	}
}
class Login extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("로그인");
	Label lbId = new Label("아이디:");
	Label lbPw = new Label("비밀번호:");
	
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	
	Button btnLogin = new Button("로그인");
	Button btnJoin = new Button("회원가입");
	
	Login()
	{
		super("로그인화면");
		this.setSize(500,800);
		this.center();
		this.init();
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
		
		this.add(btnLogin); btnLogin.setFont(font30);  
		btnLogin.setBounds(160,480,200,50);
		this.add(btnJoin); btnJoin.setFont(font30);  
		btnJoin.setBounds(160,580,200,50);
		
		this.add(tfId); tfId.setFont(font30);
		tfId.setBounds(200,250,250,50);
		this.add(tfPw); tfPw.setFont(font30);
		tfPw.setBounds(200,350,250,50);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}