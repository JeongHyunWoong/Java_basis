package 자바12_상속;

import java.util.Scanner;

public class ABan extends Score{
	Scanner sc = new Scanner(System.in);
	int soc=0,sci=0,tot=0,avg=0;
	int select;
	ABan(){
		while(true)
		{
			System.out.println("<A반 국영수사과 구하기>");
			System.out.println("1.점수입력");
			System.out.println("2.점수출력");
			System.out.println("3.종료");
			System.out.print("선택:");
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
		super.input();
		System.out.println("사회:"); soc = sc.nextInt();
		System.out.println("과학:"); sci = sc.nextInt();
		tot = kor+eng+mat+soc+sci;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("총점:"+tot+"/평균:"+avg);
	}
}


	


