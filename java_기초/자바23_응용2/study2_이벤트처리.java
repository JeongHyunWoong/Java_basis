package �ڹ�23_����2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study2_�̺�Ʈó�� {

	public static void main(String[] args) {
		PrintTest pt = new PrintTest();
	}
}
class PrintTest extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbName = new Label("�̸�:");
	Label lbEnd = new Label("���:");
	Label lbEnd1 = new Label("���:");
	Label lbResult = new Label("�����..");
	
	
	TextField tfName = new TextField();
	TextField tfResult = new TextField();
	
	Button btn = new Button("���");
	
	PrintTest()
	{
		super("����׽�Ʈ");
		this.setSize(300,400);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(20,50,70,50);
		
		this.add(lbEnd); lbEnd.setFont(font30);
		lbEnd.setBounds(40,230,70,50);
		this.add(lbEnd1); lbEnd1.setFont(font30);
		lbEnd1.setBounds(40,280,70,50);
		this.add(lbResult); lbResult.setFont(font30);
		lbResult.setBounds(120,230,140,50);
		
		this.add(btn); btn.setFont(font30);  
		btn.setBounds(80,130,130,50);

		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(100,50,150,50);
		this.add(tfResult); tfResult.setFont(font30);
		tfResult.setBounds(120,280,140,50);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
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
		
		System.out.println("�����°�:"+name);
		
		lbResult.setText(name);
		tfResult.setText(name);
	}
}