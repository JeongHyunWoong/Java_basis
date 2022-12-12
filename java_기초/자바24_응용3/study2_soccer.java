package �ڹ�24_����3;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class study2_soccer {

	public static void main(String[] args){
		Soccer s = new Soccer();
	}
}
class Soccer extends Frame implements ActionListener, ItemListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	int tot=0, ok=0, fail=0; //����ó�� ������ ������
	int Tot3=10; //�Ѱ���Ƚ��
	String name="";//������ �౸�����̸�.
	int shoot2=2;//����� 2ȸ ����
	int shoot3=1;//�г�Ƽ�� 1ȸ����
	private Font font30;
	String result="";
	
	List li = new List(3, false);
	
	Label lbList = new Label("��������Ʈ");
	Label lbName = new Label("�౸����:");
	Label lbEnd = new Label("���:");
	Label lbTot = new Label("������:");
	Label lbS = new Label("������:");
	Label lbF = new Label("������:");
	Label lbTot2 = new Label("0");
	Label lbS2 = new Label("0");
	Label lbF2 = new Label("0");
	Label lbTot3 = new Label("�Ѱ��Ӱ���Ƚ��:");
		
	Button btn1 = new Button("�߰Ÿ���");
	Button btn2 = new Button("���");
	Button btn3 = new Button("�г�Ƽ��");
	Button btn4 = new Button("�����ʱ�ȭ");
	Button btn5 = new Button("��������");
	Button btn6 = new Button("�������");
	
	TextArea ta = new TextArea();
	
	String ment1[]= {"�߰Ÿ����� ����!","�߰Ÿ��� ����..."};			
	String ment2[]= {"������� ����!","����� ����..."};
	String ment3[]= {"�г�Ƽ���� ����!","�г�Ƽ�� ����..."};
	
	Soccer()
	{
		super("��������Ʈ");
		this.setSize(1000,500);
		this.center();
		this.start();
		this.init();
		this.setVisible(true);
	}
	void init() {
		Font font20 = new Font("SansSerif", Font.BOLD, 20);
		Font font30 = new Font("SansSerif", Font.BOLD, 30);
		Font font40 = new Font("SansSerif", Font.BOLD, 40);
		
		this.setLayout(null);
		
		this.add(li); li.setFont(font40);
		li.setBounds(60,130,160,250);
		
		li.add("�����");
		li.add("�޽�");
		li.add("������");
		
		this.add(lbList); lbList.setFont(font30);
		lbList.setBounds(60,60,200,70);
		this.add(lbName); lbName.setFont(font30);
		lbName.setBounds(350,70,300,50);
		this.add(lbEnd); lbEnd.setFont(font20);
		lbEnd.setBounds(350,250,200,50);
		this.add(lbTot); lbTot.setFont(font30);
		lbTot.setBounds(350,320,120,50);
		this.add(lbS); lbS.setFont(font30);
		lbS.setBounds(350,390,120,50);
		this.add(lbF); lbF.setFont(font30);
		lbF.setBounds(550,390,120,50);
		this.add(lbTot2); lbTot2.setFont(font30);
		lbTot2.setBounds(470,320,120,50);
		this.add(lbS2); lbS2.setFont(font30);
		lbS2.setBounds(470,390,120,50);
		this.add(lbF2); lbF2.setFont(font30);
		lbF2.setBounds(670,390,120,50);
		this.add(lbTot3); lbTot3.setFont(font20);
		lbTot3.setBounds(30,410,250,50);
		
		this.add(btn1); btn1.setFont(font30);  
		btn1.setBounds(350,150,150,70);
		this.add(btn2); btn2.setFont(font30);  
		btn2.setBounds(520,150,70,70);
		this.add(btn3); btn3.setFont(font30);  
		btn3.setBounds(610,150,150,70);
		this.add(btn4); btn4.setFont(font30);  
		btn4.setBounds(570,250,170,50);
		this.add(btn5); btn5.setFont(font30);  
		btn5.setBounds(790,300,130,50);
		this.add(btn6); btn6.setFont(font30);  
		btn6.setBounds(790,380,130,50);
	}
	void start() 
	{
		li.addItemListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		
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
	public void itemStateChanged(ItemEvent e) {
		name = li.getSelectedItem();
		lbName.setText("�౸����:"+name);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn4) {
			tot=0; ok=0; fail=0;
			shoot2=2;//���2ȸ����
			shoot3=1;//�г�Ƽ1ȸ����
			Tot3=10;//����Ƚ�� �ٽ� 10�� ����
			lbTot2.setText("0ȸ");
			lbS2.setText("0ȸ");
			lbF2.setText("0ȸ");
			lbTot3.setText("�Ѱ��Ӱ���Ƚ��:"+Tot3+"ȸ");
			lbEnd.setText("�ʱ�ȭ�Ǿ����ϴ�.");
			lbName.setText("�౸����:���ô��..");
			return;
		}
		if(name.equals(""))
		{
			lbEnd.setText("���������ÿ�.");
			return;
		}
		//������ �����ϱ����� �Ѱ���Ƚ���� ����!
		if(Tot3==0)
		{
			lbEnd.setText("���� 10ȸ ��� �Ͽ����ϴ�.");
			return;
		}
		if(e.getSource()==btn1) 	  {
			tot++;
			int num = (int)(Math.random()*10);
			if(num==0 || num==1 || num==2)
			{
				lbEnd.setText(ment1[0]);
				ok++;
			}
			else
			{
				lbEnd.setText(ment1[1]);
				fail++;
			}
			Tot3--;
		}
		else if(e.getSource()==btn2) {
			if(shoot2==0)
			{
				lbEnd.setText("���Ƚ���� ��� ���!");
				return;
			}
			tot++;
			int num = (int)(Math.random()*10);
			if(num==0 || num==1 || num==2 || num==3 || num==4)
			{
				lbEnd.setText(ment2[0]);
				ok++;
			}
			else
			{
				lbEnd.setText(ment2[1]);
				fail++;
			}
			Tot3--;
			shoot2--;//���Ƚ������
		}
		else if(e.getSource()==btn3) {
			if(shoot3==0)
			{
				lbEnd.setText("�г�ƼȽ���� ��� ���!");
				return;
			}
			tot++;
			int num = (int)(Math.random()*10);
			if(num==0)
			{
				lbEnd.setText(ment3[1]);
				fail++;
			}
			else
			{
				lbEnd.setText(ment3[0]);
				ok++;
			}
			Tot3--;
			shoot3--;
		}
		if(ok==5)
		{
			final Dialog dlg = new Dialog(this, "���ϸ�Ʈ5���̻�!", true);
			Label lbCong = new Label("��ũ�����̼�~!",Label.CENTER);
			dlg.add(lbCong); lbCong.setFont(font30);
			Button bt = new Button("Ȯ��");			
			

			dlg.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg.setVisible(false);
				}
			});
			dlg.setSize(300, 200);
			dlg.setLocation(800, 500);
			dlg.setVisible(true);
		}
		lbTot3.setText("�Ѱ��Ӱ���Ƚ��:"+Tot3+"ȸ");
		lbTot2.setText(tot+"ȸ");
		lbS2.setText(ok+"ȸ");
		lbF2.setText(fail+"ȸ");
		
		if(e.getSource() == btn5)
		{
			save();
		}
		else if(e.getSource() == btn6)
		{
			load();
		}
	}
	void save() {
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\ccc\\ddd\\friends.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

	            bufferedWriter.write(name+"/"+tot+"ȸ����/������"+ok+"/������"+fail);	                        	             
	            bufferedWriter.close();           
	            result=name+"/"+tot+"ȸ����/������"+ok+"/������"+fail;
	           
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
		         }         
		   		ta.setText(data);
		            
		        bufReader.close();
		    }catch (FileNotFoundException e) { 
		    }catch(IOException e){           
		    }   
		}//���Ϸε�
}