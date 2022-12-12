package 자바23_응용2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study3_이벤트처리 {

	public static void main(String[] args) {
		Calc c = new Calc();
	}
}
class Calc extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbNumber1 = new Label("첫번째수:");
	Label lbNumber2 = new Label("두번째수:");
	Label lbResult = new Label("결과:");
	Label lbAlram = new Label("알림");
	
	TextField tfNumber1 = new TextField();
	TextField tfNumber2 = new TextField();
	TextField tfResult = new TextField();
	
	Button btn1 = new Button("+");
	Button btn2 = new Button("-");
	Button btn3 = new Button("*");
	Button btn4 = new Button("/");
	
	Calc()
	{
		super("연산테스트");
		this.setSize(300,400);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		
		this.setLayout(null);
		
		this.add(lbNumber1); lbNumber1.setFont(font20);
		lbNumber1.setBounds(30,50,100,30);
		this.add(lbNumber2); lbNumber2.setFont(font20);
		lbNumber2.setBounds(30,100,100,30);
		this.add(lbResult); lbResult.setFont(font20);
		lbResult.setBounds(30,270,70,50);
		this.add(lbAlram); lbAlram.setFont(font20);
		lbAlram.setBounds(20,330,350,20);
		
		this.add(btn1); btn1.setFont(font20);  
		btn1.setBounds(50,170,40,40);
		this.add(btn2); btn2.setFont(font20);  
		btn2.setBounds(100,170,40,40);
		this.add(btn3); btn3.setFont(font20);  
		btn3.setBounds(150,170,40,40);
		this.add(btn4); btn4.setFont(font20);  
		btn4.setBounds(200,170,40,40);

		this.add(tfNumber1); tfNumber1.setFont(font20);
		tfNumber1.setBounds(140,50,100,30);
		this.add(tfNumber2); tfNumber2.setFont(font20);
		tfNumber2.setBounds(140,100,100,30);
		this.add(tfResult); tfResult.setFont(font20);
		tfResult.setBounds(100,270,130,50);
	}
	void start()
	{
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
	public void actionPerformed(ActionEvent e)
	{
		String su1 = tfNumber1.getText();
		String su2 = tfNumber2.getText();
		//공백처리를 하는곳!!!
		if(su1.equals(""))
		{
			lbAlram.setText("첫번째수를 입력하시오!");
			return;
		}
		if(su2.equals(""))
		{
			lbAlram.setText("두번째수를 입력하시오!");
			return;
		}
		
		int number1 = Integer.parseInt(su1);
		int number2 = Integer.parseInt(su2);
		
		if(e.getSource() == btn1) 
		{
			System.out.println(number1+number2);
			tfResult.setText(number1+number2+"");
		}
		else if(e.getSource() == btn2)
		{
			System.out.println(number1-number2);
			tfResult.setText(number1-number2+"");
		}
		else if(e.getSource() == btn3)
		{
			System.out.println(number1*number2);
			tfResult.setText(number1*number2+"");
		}
		else if(e.getSource() == btn4)
		{
			System.out.println(number1/number2);
			tfResult.setText(number1/number2+"");
		}
		lbAlram.setText("정상적으로 처리되었습니다.");
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}