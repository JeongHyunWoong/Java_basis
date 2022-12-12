package 자바04_제어문시작;

import java.util.Scanner;

public class while27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int kor, eng, mat, tot=0, avg=0;
		while(true)
		{	System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:");
			select = sc.nextInt();
			
			if(select==1)
			{
			System.out.println("국어점수입력:"); kor = sc.nextInt();
			System.out.println("영어점수입력:"); eng = sc.nextInt();
			System.out.println("수학점수입력:"); mat = sc.nextInt();
			tot=kor+eng+mat;
			avg=tot/3;
			}
			else if(select==2)
			{
			System.out.println("총점:"+tot+"/평균:"+avg);
			}
			else if(select==3)
			{System.out.print("프로그램종료"); break;}
			
		}
			
	}			
}			
				
		
			
		
