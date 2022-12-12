package 자바02_제어문시작;

import java.util.Scanner;

public class switch13 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int grade;
		System.out.println("중학생학년을 입력하세요");
		grade = sc.nextInt();
		switch(grade)
		{
		case 1 : System.out.println("1학년입니다!"); break;
		case 2 : System.out.println("2학년입니다!"); break;
		case 3 : System.out.println("3학년입니다!"); break;
		//default : System.out.println("1~3만 입력해주세요!");
		}
	}}
