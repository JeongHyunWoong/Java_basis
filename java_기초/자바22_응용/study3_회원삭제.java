package 자바22_응용;
import java.awt.*;

public class study3_회원삭제 {

	public static void main(String[] args) {
		Delete d = new Delete();
	}
}
class Delete extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("회원삭제화면");
	Label lbId = new Label("아이디:");
	Label lbList = new Label("회원리스트");
	
	TextField tfId = new TextField();
	
	Button btnCO = new Button("대상검색");
	Button btnLO = new Button("전체보기");
	
	TextArea ta = new TextArea();
	
	Delete()
	{
		super("회원삭제화면");
		this.setSize(500,700);
		this.center();
		this.init();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font40 = new Font("SansSerif", Font.BOLD, 40);
		
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setFont(font40);
		lbTitle.setBounds(130,50,250,70);
		
		this.add(lbId); lbId.setFont(font30);
		lbId.setBounds(20,150,140,50);
		this.add(lbList); lbList.setFont(font40);
		lbList.setBounds(30,350,220,50);
		
		this.add(btnCO); btnCO.setFont(font30);  
		btnCO.setBounds(320,150,140,50);
		this.add(btnLO); btnLO.setFont(font30);  
		btnLO.setBounds(320,220,140,50);
		
		this.add(tfId); tfId.setFont(font30);
		tfId.setBounds(160,150,140,50);
		
		this.add(ta); ta.setFont(font30);
		ta.setBounds(30,420,430,200);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}