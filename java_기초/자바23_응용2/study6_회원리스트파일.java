package �ڹ�23_����2;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study6_ȸ������Ʈ���� {

	public static void main(String[] args){
		Friends f = new Friends();
	}
}
class Friends extends Frame implements ActionListener {
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
	
	Button btn1 = new Button("�߰��ϱ�");
	Button btn2 = new Button("��������");
	Button btn3 = new Button("�о����");
	
	TextArea ta = new TextArea();
	
	Friends()
	{
		super("ȸ������Ʈ����");
		this.setSize(1100,400);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
	}
	void init() {
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font50 = new Font("SansSerif", Font.BOLD, 50);
		
		this.setLayout(null);
		
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(50,60,80,30);
		this.add(lbPN); lbPN.setFont(font30);
		lbPN.setBounds(50,110,80,30);
		this.add(lbAdd); lbAdd.setFont(font30);
		lbAdd.setBounds(50,160,80,30);
		this.add(lbList); lbList.setFont(font30);
		lbList.setBounds(400,50,200,30);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(80,250,200,50);
		this.add(btn2); btn2.setFont(font50);  
		btn2.setBounds(800,120,230,70);
		this.add(btn3); btn3.setFont(font50);  
		btn3.setBounds(800,220,230,70);

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
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
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
		if(e.getSource() == btn1)
		{
			String name = tfName.getText();
			String pn = tfPN.getText();
			String add = tfAdd.getText();
		
			int pn2 = Integer.parseInt(pn);
			
			if(e.getSource() == btn1) 
			{
				System.out.println(Count+"��:"+name+"/"+pn+"/"+add);
				
			}
			ta.setText(result+=Count+"��:"+name+"/"+pn+"/"+add+"\n");
			Count++;
			
			tfName.setText("");
			tfPN.setText("");
			tfAdd.setText("");
		}
		else if(e.getSource() == btn2)
		{
			save();
		}
		else if(e.getSource() == btn3)
		{
			load();
		}
	}
	void save() {
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\ccc\\ddd\\friends.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

 		
	            bufferedWriter.write(result);	                        	             
	            bufferedWriter.close();           
	            ta.setText("");
	            result="";
	        }catch (IOException e) {
	            System.out.println(e);
	        }//��������
	}
	void load() {
		try{
		   //���� ��ü ����
		   File file = new File("C:\\ccc\\ddd\\friends.txt");
		   //�Է� ��Ʈ�� ����
		   FileReader filereader = new FileReader(file);
		   //�Է� ���� ����
		   BufferedReader bufReader = new BufferedReader(filereader);
		   String line = "";            
		   String data = "";
		   
		   while((line = bufReader.readLine()) != null){
		         data += line+"\n";
		         result += line+"\n";
		         Count++;	            	
		         }         
		        ta.setText(data);
		            
		        bufReader.close();
		    }catch (FileNotFoundException e) { 
		    }catch(IOException e){           
		    }
			   
			   
		   }//���Ϸε�
		
}