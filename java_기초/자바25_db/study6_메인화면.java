package 자바25_db;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study6_메인화면 {

	public static void main(String[] args) {
		Main m = new Main();
	}
}
class Main extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("메인화면");
	
	Button btn1 = new Button("회원조회");
	Button btn2 = new Button("회원수정");
	Button btn3 = new Button("회원삭제");
	Button btn4 = new Button("회원가입");
	Button btn5 = new Button("종료");
	
	Main()
	{
		super("메인화면");
		this.setSize(500,800);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font50 = new Font("SansSerif", Font.BOLD, 50);
		
		this.setLayout(null);
		this.add(lbTitle); lbTitle.setFont(font50);
		lbTitle.setBounds(140,80,200,50);
		
		this.add(btn1); btn1.setFont(font50);  
		btn1.setBounds(130,180,220,70);
		this.add(btn2); btn2.setFont(font50);  
		btn2.setBounds(130,280,220,70);
		this.add(btn3); btn3.setFont(font50);  
		btn3.setBounds(130,380,220,70);
		this.add(btn4); btn4.setFont(font50);  
		btn4.setBounds(130,480,220,70);
		this.add(btn5); btn5.setFont(font50);  
		btn5.setBounds(140,600,200,70);
	}
	void start()
	{
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
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
		
		if(e.getSource()==btn1) {JH j = new JH();}
		if(e.getSource()==btn2) {Sj s = new Sj();}
		if(e.getSource()==btn3) {Delete d = new Delete();}
		if(e.getSource()==btn4) {Member1 m = new Member1();}
		if(e.getSource()==btn5) {this.setVisible(false);} 
	}
}