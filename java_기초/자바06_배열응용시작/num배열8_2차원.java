package 자바06_배열응용시작;

import java.util.Scanner;

public class num배열8_2차원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int MAX=2;
		String name[][] = new String[MAX][MAX];
		String phone[][] = new String[MAX][MAX];
		String add[][] = new String[MAX][MAX];
		while(true)
		{
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보검색");
			System.out.println("4.종료");
			System.out.print("선택:");
			select = sc.nextInt();
			
			if(select==1)
			{
				for(int i=0; i<name.length; i++)
				{
					for(int j=0; j<MAX; j++)	// name.length=MAX					
					{
						System.out.print(i+1+"반"+(j+1)+"번 이름:"); name[i][j] = sc.next();
						System.out.print(i+1+"반"+(j+1)+"번 전번:"); phone[i][j] = sc.next();
						System.out.print(i+1+"반"+(j+1)+"번 주소:"); add[i][j] = sc.next();
					}
				}
			}
			else if(select==2)
			{
				for(int i=0; i<name.length; i++)
				{	
					for(int j=0; j<name.length; j++)
					{
						System.out.println
						(i+1+"반"+(j+1)+"번"+name[i][j]+"/"+phone[i][j]+"/"+add[i][j]);
					}
				}
			}	
			else if(select==3)
				{
					for(int i=0; i<name.length; i++)
						
					{
						for(int j=0; j<name.length; j++)
							{
								System.out.print("검색이름:");
								String search = sc.next();
								if(search.equals(name[i][j]))
								{	
									System.out.println
									(i+1+"반"+(j+1)+"번"+name[i][j]+"/"+phone[i][j]+"/"+add[i][j]);
								}
			
							}
					}
				}
			else if(select==4)
				{System.out.print("프로그램종료"); break;}
		}
	}

}
