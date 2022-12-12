package 자바16_클래스_2;

import java.util.Scanner;

public class study5_aircon {

	public static void main(String[] args) {
		Air air = new Air();
	}
}
class Air extends Thread{
	Scanner sc = new Scanner(System.in);
	int nowC=25; //현재온도
	int chaC=20; //설정온도
	boolean runCheck = false;//에어컨의 동작제어 //boolean = 참/거짓
	Air()
	{
		start();//에어컨 동작중....
		while(true)
		{
			System.out.println("[현재온도:"+nowC+"도/설정온도:"+chaC+"도]");
			System.out.println("1.에어컨가동");
			System.out.println("2.온도설정");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel ==1 ) {
				System.out.println("에어컨이 가동됩니다.");
				runCheck =true;
				
			}
			else if(sel ==2 ) {
				System.out.println();
				System.out.println("[설정온도"+chaC+"도]");
				System.out.print("온도변경:"); chaC = sc.nextInt();
				System.out.println();
			}
			else if(sel ==3 ) {break;}
	}
}
	public void run() {
		while(true)
		{
			//runCheck 이 변수로 제어하기 위해서 잠시 렉으로 제어
			try {
				sleep(1000);
			}catch(InterruptedException e) {}
			
			if(runCheck==true)
			{
				int rnd = (int)(Math.random()*2);
				try {
					nowC-= rnd;
					sleep(1000);
					System.out.println("현재온도: "+nowC+"도");
				} catch (InterruptedException e) {}
				if(nowC==chaC)
				{
					System.out.println("설정온도 도달! 작동중지!");
					runCheck=false;
				}
			}
		}
	}
}

	




