package 자바02_제어문시작;

import java.util.Scanner;

public class switch15 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int Number1,Number2;
		int result=0;
		System.out.println("첫번째수"); Number1 = sc.nextInt();
		System.out.println("두번째수"); Number2 = sc.nextInt();
		
		String cal;
		System.out.println("cal"); cal = sc.next();
		
		switch(cal) 
		{
		case "+" : result=Number1+Number2; break;
		case "-" : result=Number1-Number2; break;
		case "*" : result=Number1*Number2; break;
		case "/" : result=Number1/Number2; break;
		}
		System.out.println(result);
		}}
		
