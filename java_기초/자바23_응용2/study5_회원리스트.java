package �ڹ�23_����2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study5_ȸ������Ʈ {

	public static void main(String[] args) {
		List l = new List();
	}
}
class List extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	int Count=1;
	String result="";
	
	Label lbName = new Label("�̸�:");
	Label lbPN = new Label("����:");
	Label lbAdd = new Label("�ּ�:");
	Label lbList = new Label("ȸ������Ʈ");
	
	TextField tfName = new TextField();
	TextField tfPN = new TextField();
	TextField tfAdd = new TextField();
	
	Button btn = new Button("�߰��ϱ�");
	
	TextArea ta = new TextArea();
	
	List()
	{
		super("ȸ������Ʈ");
		this.setSize(800,400);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(50,60,80,30);
		this.add(lbPN); lbPN.setFont(font30);
		lbPN.setBounds(50,110,80,30);
		this.add(lbAdd); lbAdd.setFont(font30);
		lbAdd.setBounds(50,160,80,30);
		this.add(lbList); lbList.setFont(font30);
		lbList.setBounds(400,50,200,30);
		
		this.add(btn); btn.setFont(font30);  
		btn.setBounds(80,250,200,50);

		this.add(tfName); tfName.setFont(font30);
		tfName.setBounds(140,60,150,30);
		this.add(tfPN); tfPN.setFont(font30);
		tfPN.setBounds(140,110,150,30);
		this.add(tfAdd); tfAdd.setFont(font30);
		tfAdd.setBounds(140,160,150,30);
		
		this.add(ta); ta.setFont(font30);
		ta.setBounds(400,100,350,250);
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
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos,ypos);
	}
	public void actionPerformed(ActionEvent e) {
		{
			String name = tfName.getText();
			String pn = tfPN.getText();
			String add = tfAdd.getText();
		
			int pn2 = Integer.parseInt(pn);
			
			if(e.getSource() == btn) 
			{
				System.out.println(Count+"��:"+name+"/"+pn+"/"+add);
				
			}
			ta.setText(result+=Count+"��:"+name+"/"+pn+"/"+add+"\n");
			Count++;
			
			tfName.setText("");
			tfPN.setText("");
			tfAdd.setText("");
		}
	}
}