package 자바24_응용3;
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
	int tot=0, ok=0, fail=0; //전적처리 슛성공 슛실패
	int Tot3=10; //총게임횟수
	String name="";//선택한 축구선수이름.
	int shoot2=2;//헤딩은 2회 제한
	int shoot3=1;//패널티는 1회제한
	private Font font30;
	String result="";
	
	List li = new List(3, false);
	
	Label lbList = new Label("선수리스트");
	Label lbName = new Label("축구선수:");
	Label lbEnd = new Label("결과:");
	Label lbTot = new Label("총전적:");
	Label lbS = new Label("슛성공:");
	Label lbF = new Label("슛실패:");
	Label lbTot2 = new Label("0");
	Label lbS2 = new Label("0");
	Label lbF2 = new Label("0");
	Label lbTot3 = new Label("총게임가능횟수:");
		
	Button btn1 = new Button("중거리슛");
	Button btn2 = new Button("헤딩");
	Button btn3 = new Button("패널티슛");
	Button btn4 = new Button("전적초기화");
	Button btn5 = new Button("파일저장");
	Button btn6 = new Button("게임통계");
	
	TextArea ta = new TextArea();
	
	String ment1[]= {"중거리슛이 성공!","중거리슛 실패..."};			
	String ment2[]= {"헤딩슛이 성공!","헤딩슛 실패..."};
	String ment3[]= {"패널티슛이 성공!","패널티슛 실패..."};
	
	Soccer()
	{
		super("선수리스트");
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
		
		li.add("손흥민");
		li.add("메시");
		li.add("날강두");
		
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
		lbName.setText("축구선수:"+name);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn4) {
			tot=0; ok=0; fail=0;
			shoot2=2;//헤딩2회충전
			shoot3=1;//패널티1회충전
			Tot3=10;//게임횟수 다시 10개 충전
			lbTot2.setText("0회");
			lbS2.setText("0회");
			lbF2.setText("0회");
			lbTot3.setText("총게임가능횟수:"+Tot3+"회");
			lbEnd.setText("초기화되었습니다.");
			lbName.setText("축구선수:선택대기..");
			return;
		}
		if(name.equals(""))
		{
			lbEnd.setText("선수를고르시오.");
			return;
		}
		//게임을 시작하기전에 총게임횟수로 제어!
		if(Tot3==0)
		{
			lbEnd.setText("게임 10회 모두 하였습니다.");
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
				lbEnd.setText("헤딩횟수를 모두 사용!");
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
			shoot2--;//헤딩횟수차감
		}
		else if(e.getSource()==btn3) {
			if(shoot3==0)
			{
				lbEnd.setText("패널티횟수를 모두 사용!");
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
			final Dialog dlg = new Dialog(this, "축하멘트5승이상!", true);
			Label lbCong = new Label("콩크리츄레이션~!",Label.CENTER);
			dlg.add(lbCong); lbCong.setFont(font30);
			Button bt = new Button("확인");			
			

			dlg.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg.setVisible(false);
				}
			});
			dlg.setSize(300, 200);
			dlg.setLocation(800, 500);
			dlg.setVisible(true);
		}
		lbTot3.setText("총게임가능횟수:"+Tot3+"회");
		lbTot2.setText(tot+"회");
		lbS2.setText(ok+"회");
		lbF2.setText(fail+"회");
		
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
	            //파일 객체 생성
	            File file = new File("C:\\ccc\\ddd\\friends.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

	            bufferedWriter.write(name+"/"+tot+"회도전/슛성공"+ok+"/슛실패"+fail);	                        	             
	            bufferedWriter.close();           
	            result=name+"/"+tot+"회도전/슛성공"+ok+"/슛실패"+fail;
	           
	        }catch (IOException e) {
	            System.out.println(e);
	        }//파일저장
	}
	void load() {
		try{
		   //파일 객체 생성
		   File file = new File("C:\\ccc\\ddd\\friends.txt");
		   //입력 스트림 생성
		   FileReader filereader = new FileReader(file);
		   //입력 버퍼 생성
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
		}//파일로드
}