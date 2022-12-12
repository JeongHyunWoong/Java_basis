package 자바15_클래스_랜덤및스레드;

import java.util.Scanner;

public class study4_가위바위보 {

	public static void main(String[] args) {
		Gbb gbb = new Gbb();
		gbb.start();
	}
}
class Gbb extends Thread{
	Scanner sc = new Scanner(System.in);
	int tot,win,draw,loss;//총전적 승 무 패 변수
	String myChoice;//내선택
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
					if(com==0) {System.out.println("무승부!"); draw++;}//비킴
					if(com==1) {System.out.println("나의패배!"); loss++;}//패배
					if(com==2) {System.out.println("나의승리!"); win++;}//승리
				if(myChoice.equals("바위"))
				{
					com(com);
					if(com==0) {System.out.println("나의승리!"); win++;}//승리
					if(com==1) {System.out.println("무승부!"); draw++;}//비김
					if(com==2) {System.out.println("나의패배!"); loss++;}//패배
				}
				if(myChoice.equals("보"))
				{
					com(com);
					if(com==0) {System.out.println("나의패배!"); loss++;}//패배
					if(com==1) {System.out.println("나의승리!"); win++;}//승리
					if(com==2) {System.out.println("무승부!"); draw++;}//비김
				}
			}
			else if(sel==2) {
				System.out.println("총전적:"+tot);
				System.out.println("승리:"+win); 
				System.out.println("패배:"+loss); 
				System.out.println("무승부:"+draw); 
			}
			else if(sel==3) 
			{System.out.println("프로그램종료"); break;}
			}
		}
	}
	
	void com(int sel)
	{
		if(sel==0) 		{System.out.println("컴퓨터가 가위를 냈습니다.");}
		else if(sel==1) {System.out.println("컴퓨터가 바위를 냈습니다.");}
		else if(sel==2) {System.out.println("컴퓨터가 보를 냈습니다.");}
	}
	
}



