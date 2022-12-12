package 자바23_응용2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study4_야구 {

	public static void main(String[] args) {
		Bb b = new Bb();
	}
}
class Bb extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbName = new Label("타자:");
	Label lbRecord = new Label("현재기록");
	Label lbHit = new Label("안타:");
	Label lbHr = new Label("홈런:");
	Label lbFoul = new Label("파울:");
	Label lbHit2 = new Label("0");
	Label lbHr2 = new Label("0");
	Label lbFoul2 = new Label("0");
	Label lbNum1 = new Label("3...");
	Label lbNum2 = new Label("2...");
	Label lbNum3 = new Label("1...");
	Label lbRm = new Label("랜덤멘트");
	
	TextField tfName = new TextField();
	
	Button btn = new Button("게임스타트!");
	
	String ments[] = {"안타를 쳤습니다!","홈런을 쳤습니다!","파울을 쳤습니다!"};
	
	int anCnt=0, homCnt=0, paCnt=0;
	
	Bb()
	{
		super("야구테스트");
		this.setSize(400,600);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		
		this.setLayout(null);
		
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(30,50,80,30);
		this.add(lbRecord); lbRecord.setFont(font30);
		lbRecord.setBounds(30,370,150,30);
		this.add(lbHit); lbHit.setFont(font30);
		lbHit.setBounds(50,420,80,30);
		this.add(lbHr); lbHr.setFont(font30);
		lbHr.setBounds(50,470,80,30);
		this.add(lbFoul); lbFoul.setFont(font30);
		lbFoul.setBounds(50,520,80,30);
		this.add(lbHit2); lbHit2.setFont(font30);
		lbHit2.setBounds(150,420,150,30);
		this.add(lbHr2); lbHr2.setFont(font30);
		lbHr2.setBounds(150,470,150,30);
		this.add(lbFoul2); lbFoul2.setFont(font30);
		lbFoul2.setBounds(150,520,150,30);
		this.add(lbNum1); lbNum1.setFont(font30);
		lbNum1.setBounds(70,200,60,30);
		this.add(lbNum2); lbNum2.setFont(font30);
		lbNum2.setBounds(150,200,60,30);
		this.add(lbNum3); lbNum3.setFont(font30);
		lbNum3.setBounds(230,200,60,30);
		this.add(lbRm); lbRm.setFont(font20);
		lbRm.setBounds(30,280,380,30);
		
		this.add(btn); btn.setFont(font30);  
		btn.setBounds(100,120,200,50);

		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(120,50,150,30);
	}
	void start()
	{
		btn.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
	public void actionPerformed(ActionEvent e)
	{
		String name = tfName.getText();

		if(name.equals("")) {
			lbName.setText("타자이름을 넣어주세요.");
			return;}
		
		ing();//3 2 1 멘트처리용
		//랜덤으로 멘트생성!!
		int rd = (int)(Math.random()*3);
		//처리를 위해서 제어
		if(rd == 0) {anCnt++;}
		else if(rd == 1) {homCnt++;}
		else if(rd == 2) {paCnt++;}		
		
		lbRm.setText(name+"(이)가 "+ments[rd]);
		
		lbHit2.setText(anCnt+"");
		lbHr2.setText(homCnt+"");
		lbFoul2.setText(paCnt+"");
			
	}
	void ing()
	{
		try {Thread.sleep(700);	
		lbNum1.setText("3.....");
		lbNum2.setText("");
		lbNum3.setText("");		
		} catch (InterruptedException e) {}
		try {Thread.sleep(700);	
		lbNum1.setText("");		
		lbNum2.setText("2...");
		lbNum3.setText("");
		} catch (InterruptedException e) {}
		try {Thread.sleep(700);	
		lbNum1.setText("");
		lbNum2.setText("");
		lbNum3.setText("1..");				
		} catch (InterruptedException e) {}
		try {Thread.sleep(700);		
		} catch (InterruptedException e) {}
		
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}