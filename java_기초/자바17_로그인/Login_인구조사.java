package 자바17_로그인;

import java.util.Scanner;

public class Login_인구조사 {

	public static void main(String[] args) {
		Pp p = new Pp();
	}
}		
class Pp{
	Scanner sc = new Scanner(System.in);
	int SG, JG, DG, UG, DDG; //서구 중구 동구 유성구 대덕구
	int tot;
	int count = 0;

	Pp()
	{
		while(true)
		{
			System.out.println("<대전인구조사프로그램>");
			System.out.println("1.인구입력");
			System.out.println("2.인구보기");
			System.out.println("3.종료");
			System.out.println("선택:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				System.out.println("서구(단위:만):"); SG = sc.nextInt();
				System.out.println("중구(단위:만):"); JG = sc.nextInt();
				System.out.println("동구(단위:만):"); DG = sc.nextInt();
				System.out.println("유성구(단위:만):"); UG = sc.nextInt();
				System.out.println("대덕구(단위:만):"); DDG = sc.nextInt();
			}
			else if(sel==2) 
			{
				pp();
			}
			else if(sel==3) 
			{
				System.out.println("프로그램종료"); break;
			}
		}		
	}
	void pp()
	{
		tot=SG+JG+DG+UG+DDG;
		{
			System.out.println("대전총인구:"+tot+"만명");
			System.out.println("서구:"+SG+"만"+"/중구:"+JG+"만"+"/동구:"+DG+"만"+"/유성구:"+UG+"만"+"/대덕구:"+DDG+"만");
		}
	}	
}



