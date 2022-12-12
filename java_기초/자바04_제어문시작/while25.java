package 자바04_제어문시작;

import java.util.Scanner;

public class while25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		while(true)
		{
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print("선택:");
			select = sc.nextInt();
			if(select==1)
			{System.out.print("입력기능입니다.");}			
			else if(select==2)
			{System.out.print("츨력기능입니다.");}
			else if(select==3)
			{System.out.print("프로그램종료."); break;}
		}
	}	
}			
			
			
		
