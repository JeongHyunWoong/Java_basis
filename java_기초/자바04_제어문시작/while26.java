package 자바04_제어문시작;

import java.util.Scanner;

public class while26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		while(true)
		{	System.out.println("1.구구단출력");
			System.out.println("2.별표찍기");
			System.out.println("3.종료");
			System.out.print("선택:");
			select = sc.nextInt();
				
			if(select==1)
			{	int dan=2;
				while(dan<10)
			{	int su=1;
				while(su<10)
				{	System.out.println(dan+"x"+su+"="+dan*su);
					su++;
				}
				dan++;
			}}
			else if(select==2)
				for(int i=0 ; i<3 ; i++)
				{	for(int j=0 ; j<=i ; j++)
						{System.out.print("*");}
					
						System.out.println();
				}
			else if(select==3)
			{System.out.print("프로그램종료"); break;}	
		}	
}}		
			
			
		
