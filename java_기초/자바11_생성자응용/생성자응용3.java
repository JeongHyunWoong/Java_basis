package 자바11_생성자응용;

import java.util.Scanner;

public class 생성자응용3 {

	public static void main(String[] args) {
		Account a = new Account();
	}
}
class Account{
	Scanner sc = new Scanner(System.in);
	String id[] = new String[100];
	String pw[] = new String[100];
	String name[] = new String[100];
	int cash[] = new int[100];
	int count=0;
	
	Account()
	{
		while(true)
		{
			System.out.println("1.계좌생성");
			System.out.println("2.계좌조회");
			System.out.println("3.입금하기");
			System.out.println("4.출금하기");
			System.out.println("5.전체계좌조회");
			System.out.println("6.프로그램종료");
			System.out.print("선택:");
			int select = sc.nextInt();
			
			if(select==1)
			{
				accCreate();
			}
			else if(select==2)
			{		
				select();
			}
			else if(select==3)
			{
				inCash();
			}
			else if(select==4)
			{
				outCash();
			}
			else if(select==5)
			{
				selectAll();
			}
			else if(select==6)
			{
				System.out.println("프로그램종료"); break;
			}
		}	
	}
	void accCreate() 
	{
		System.out.println("계좌번호:"); id[count] = sc.next();
		System.out.println("비밀번호:"); pw[count] = sc.next();
		System.out.println("이름:"); name[count] = sc.next();
		System.out.println("입금액:"); cash[count] = sc.nextInt();
		count++;
	}
	void select()
	{
		System.out.println("계좌번호:"); String inputId=sc.next();
		System.out.println("비밀번호:"); String inputPw=sc.next();
		for(int i=0; i<count; i++)
		{
			if(id[i].equals(inputId))
			{
				if(pw[i].equals(inputPw))
				{
					System.out.println("\n잔액:"+cash[i]);
				}
			}
		}
	}
	void inCash() 
	{
		System.out.println("계좌번호:"); String inputId=sc.next();
		System.out.println("입금액:"); int inputCash = sc.nextInt();
		for(int i=0; i<count; i++)
			{
			if(id[i].equals(inputId))
				{
					//cash[i] - cash[i]+inputCash;
					cash[i] += inputCash;
					System.out.println("총액:"+cash[i]);
				}	
			}
	}
	void outCash() 
	{
		System.out.println("계좌번호:"); String inputId=sc.next();
		System.out.println("비밀번호:"); String inputPw=sc.next();
		System.out.println("출금액:"); int outputCash = sc.nextInt();
		for(int i=0; i<count; i++)
			{
			if(id[i].equals(inputId))
				{
				if(pw[i].equals(inputPw))
					{
						cash[i] -= outputCash;;
						System.out.println("총액:"+cash[i]);
					}
				}
			}
	}
	void selectAll() 
	{
		for(int i=0; i<count; i++)
		{
			System.out.println("계좌번호:"+id[i]+"/계좌주명:"+name[i]+"/잔액:"+cash[i]);
		}
	}
}
