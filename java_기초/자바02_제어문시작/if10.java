package 자바02_제어문시작;

import java.util.Scanner;

public class if10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("나이를 입력 :");
		age = sc.nextInt();
		if(age>=18)	{System.out.println("성인입니다!");}
		else        {System.out.println("미성년입니다!");}
		
	}

}
