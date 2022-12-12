package 자바24_응용3;
import java.awt.*;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study1_점수올리기 {

	public static void main(String[] args) {
		MouseGame mg = new MouseGame();
	}
}
class MouseGame extends Frame implements MouseListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Button btn1 = new Button("+1점");
	Button btn2 = new Button("+2점");
	Button btn3 = new Button("+3점");
	
	TextArea ta = new TextArea();
	
	int score = 0;
	
	MouseGame()
	{
		super("점수파일");
		this.setSize(500,500);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(ta); ta.setFont(font30);
		ta.setBounds(50,250,300,100);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(50,100,100,70);
		this.add(btn2); btn2.setFont(font30);  
		btn2.setBounds(200,100,100,70);
		this.add(btn3); btn3.setFont(font30);  
		btn3.setBounds(350,100,100,70);
	}
	void start()
	{
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
	}
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {
		
		if(e.getSource()==btn1) { score++;}
		else if(e.getSource()==btn2) { score+=2;}
		else if(e.getSource()==btn3) { score+=3;}
		ta.setText("현재점수:"+score+"점");
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
}
