package �ڹ�22_����;
import java.awt.*;

public class study2_ȸ������ {

	public static void main(String[] args) {
		Join j = new Join();
	}
}
class Join extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("ȸ������");
	Label lbId = new Label("���̵�:");
	Label lbPw = new Label("��й�ȣ:");
	Label lbC = new Label("���Ȯ��:");
	Label lbName = new Label("�̸�:");
	Label lbPN = new Label("����:");
	
	TextField tfId = new TextField();
	TextField tfPw = new TextField();
	TextField tfC = new TextField();
	TextField tfName = new TextField();
	TextField tfPN = new TextField();
	
	Button btnLogin = new Button("�ߺ�üũ");
	Button btnLP = new Button("���ԿϷ�");
	
	Join()
	{
		super("ȸ������ȭ��");
		this.setSize(500,700);
		this.center();
		this.init();
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
		
		this.add(btnLogin); btnLogin.setFont(font30);  
		btnLogin.setBounds(350,150,130,50);
		this.add(btnLP); btnLP.setFont(font30);  
		btnLP.setBounds(170,550,150,50);
		
		this.add(tfId); tfId.setFont(font30);
		tfId.setBounds(180,150,150,50);
		this.add(tfPw); tfPw.setFont(font30);
		tfPw.setBounds(180,220,150,50);
		this.add(tfC); tfC.setFont(font30);
		tfC.setBounds(180,290,150,50);
		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(180,360,150,50);
		this.add(tfPN); tfPN.setFont(font30);
		tfPN.setBounds(180,430,150,50);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}