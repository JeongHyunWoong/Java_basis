package 자바11_생성자응용;

import java.util.Scanner;

public class 생성자응용2 {

	public static void main(String[] args) {
		Friends t = new Friends();
	}
}
class Friends{
	Scanner sc = new Scanner(System.in);
	String name[] = new String[100];
	String phone[] = new String[100];
	String area[] = new String[100];
	String sex[] = new String[100];
	int age[] = new int[100];
	int count=0;
	
	Friends()
	{
		while(true)
		{
			System.out.println("1.친구추가");
			System.out.println("2.친구전체보기");
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
		System.out.print("이름:"); name[count] = sc.next();
		System.out.print("전번:"); phone[count] = sc.next();
		System.out.print("지역:"); area[count] = sc.next();
		System.out.print("성별:"); sex[count] = sc.next();
		System.out.print("나이:"); age[count] = sc.nextInt();
		count++;
	}
	void output()
	{
		for(int i=0 ; i<count ; i++)
		System.out.println(i+1+"번 학생"+name[i]+"/전번:"+phone[i]+"/지역:"+area[i]+"/성별:"+sex[i]+"/나이"+age[i]);
	}
}
