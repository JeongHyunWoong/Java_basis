package 자바18_파일로그;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class study2_가위바위보 {

	public static void main(String[] args) {
		Gbb gbb = new Gbb();
		gbb.start();
	}
}
class Gbb extends Thread{
	Scanner sc = new Scanner(System.in);
	int tot,win,draw,loss;//총전적 승 무 패 변수
	String myChoice;//내선택
	String ment="";
	public void run()
	{
		System.out.println("<<가위바위보게임!>>");
		while(true)
		{
			System.out.println("1.게임시작");
			System.out.println("2.통계보기");
			System.out.println("3.종료");
			System.out.println("선택:");
			int sel = sc.nextInt();
			if(sel==1) {
				tot++;//게임시작만하면 그냥 증가 총전적..
				System.out.print("내선택:"); myChoice = sc.next();
			    
				for(int i=3; i>0; i--)
				{
					try {
			    		sleep(1000);
			    	}catch(InterruptedException ie) {}
					System.out.println(i);
				}
				int com = (int)(Math.random()*3);//0:가위 1:바위 2:보
				if(myChoice.equals("가위"))
				{
					com(com);
					if(com==0) {System.out.println("무승부!"); draw++;ment="비김";}//비킴
					if(com==1) {System.out.println("나의패배!"); loss++;ment="패배";}//패배
					if(com==2) {System.out.println("나의승리!"); win++;ment="승리";}//승리	
				}
				if(myChoice.equals("바위"))
				{
					com(com);
					if(com==0) {System.out.println("나의승리!"); win++;ment="승리";}//승리
					if(com==1) {System.out.println("무승부!"); draw++;ment="비김";}//비김
					if(com==2) {System.out.println("나의패배!"); loss++;ment="패배";}//패배
				}
				if(myChoice.equals("보"))
				{
					com(com);
					if(com==0) {System.out.println("나의패배!"); loss++;ment="패배";}//패배
					if(com==1) {System.out.println("나의승리!"); win++;ment="승리";}//승리
					if(com==2) {System.out.println("무승부!"); draw++;ment="비김";}//비김
				}
				try {
					Thread.sleep(1000);	
					//현재 시간구하기 초까지...
		            Date nowDate = new Date();
		        	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("기록 yyyy년 MM월 dd일 hh시 mm분 ss초");      
		        	String now = simpleDateFormat.format(nowDate);
					//파일 객체 생성후 기록
			        File file = new File("C:\\aaa\\work\\data07111.txt");
			        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
			        bufferedWriter.write("승부는?:"+ment+now);
			        bufferedWriter.newLine();
			        bufferedWriter.close();
			            
			        System.out.println(now);
	            	
				} catch (InterruptedException e) {								
					e.printStackTrace();
			}       
	        catch (IOException e) {
	            System.out.println(e);
	        }
			}
			else if(sel==2) 
			{ 			        
				System.out.println("총전적:"+tot);
				System.out.println("승리:"+win);
				System.out.println("패배:"+loss);
				System.out.println("무승부:"+draw);
				try{
		            //파일 객체 생성
		            File file = new File("C:\\aaa\\work\\data07111.txt");
		            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
		                //쓰기
		            	bufferedWriter.write("총전적:"+tot);
		                bufferedWriter.newLine();
		                bufferedWriter.write("승리:"+win);
		                bufferedWriter.newLine();
		                bufferedWriter.write("패배:"+loss);
		                bufferedWriter.newLine();
		                bufferedWriter.write("무승부:"+draw);
		                bufferedWriter.newLine();
		                  
		                bufferedWriter.close();
		        }catch (IOException e) {
		            System.out.println(e);
		        }
			}
			else if(sel==3) 
			{System.out.println("프로그램종료"); break;}
		}
	}
	
	void com(int sel)
	{
		if(sel==0) 		{System.out.println("컴퓨터가 가위를 냈습니다.");}
		else if(sel==1) {System.out.println("컴퓨터가 바위를 냈습니다.");}
		else if(sel==2) {System.out.println("컴퓨터가 보를 냈습니다.");}
	}
	
}



