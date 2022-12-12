package 자바23_응용2;
import java.awt.*;

public class study1_계산기 {

	public static void main(String[] args) {
		Cal c = new Cal();
	}
}
class Cal extends Frame{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbEnd = new Label("결과:");
	
	TextField tfEnd = new TextField();
	
	Button btn0 = new Button("0");
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btn10 = new Button("+");
	Button btn11 = new Button("-");
	Button btn12 = new Button("*");
	Button btn13 = new Button("c");
	Button btn14 = new Button("=");
	Button btn15 = new Button("/");
	
	Cal()
	{
		super("계산기");
		this.setSize(500,700);
		this.center();
		this.init();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font40 = new Font("SansSerif", Font.BOLD, 40);
		
		this.setLayout(null);
		this.add(lbEnd); lbEnd.setFont(font30);
		lbEnd.setBounds(20,550,80,50);
		
		this.add(btn0); btn0.setFont(font40);  
		btn0.setBounds(140,360,100,100);
		this.add(btn1); btn1.setFont(font40);  
		btn1.setBounds(30,30,100,100);
		this.add(btn2); btn2.setFont(font40);  
		btn2.setBounds(140,30,100,100);
		this.add(btn3); btn3.setFont(font40);  
		btn3.setBounds(250,30,100,100);
		this.add(btn4); btn4.setFont(font40);  
		btn4.setBounds(30,140,100,100);
		this.add(btn5); btn5.setFont(font40);  
		btn5.setBounds(140,140,100,100);
		this.add(btn6); btn6.setFont(font40);  
		btn6.setBounds(250,140,100,100);
		this.add(btn7); btn7.setFont(font40);  
		btn7.setBounds(30,250,100,100);
		this.add(btn8); btn8.setFont(font40);  
		btn8.setBounds(140,250,100,100);
		this.add(btn9); btn9.setFont(font40);  
		btn9.setBounds(250,250,100,100);
		this.add(btn10); btn10.setFont(font40);  
		btn10.setBounds(360,30,100,100);
		this.add(btn11); btn11.setFont(font40);  
		btn11.setBounds(360,140,100,100);
		this.add(btn12); btn12.setFont(font40);  
		btn12.setBounds(360,250,100,100);
		this.add(btn13); btn13.setFont(font40);  
		btn13.setBounds(30,360,100,100);
		this.add(btn14); btn14.setFont(font40);  
		btn14.setBounds(250,360,100,100);
		this.add(btn15); btn15.setFont(font40);  
		btn15.setBounds(360,360,100,100);
		
		
		this.add(tfEnd); tfEnd.setFont(font30);
		tfEnd.setBounds(120,550,300,50);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}