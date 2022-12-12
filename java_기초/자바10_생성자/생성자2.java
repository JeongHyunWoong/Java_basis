package 자바10_생성자;

import java.util.Scanner;

public class 생성자2 {

	public static void main(String[] args) {
		score t = new score();
	}
}
class score{
	Scanner sc = new Scanner(System.in);
	int kor,eng,mat,tot,avg;
	score()
	{
		while(true)
		{
			System.out.println("<출력형태>");
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.println("선택:");
			int select = sc.nextInt();
			
			if(select==1)
			{
				input();
			}
			else if(select==2)
			{
				output();
			}
			else if(select==3)
			{
				System.out.println("프로그램종료"); break;
			}
		}	
	}
	void input()
	{
	System.out.println("국어:"); kor=sc.nextInt();
	System.out.println("영어:"); eng=sc.nextInt();
	System.out.println("수학:"); mat=sc.nextInt();
	tot = kor+eng+mat;
	avg = tot/3;
	}
	void output()
	{
		System.out.println("총점:"+tot+"/평균:"+avg);
	}
}
