package 자바02_제어문시작;

import java.util.Scanner;

public class if11 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.println("중학생학년을 입력하세요:");
		grade = sc.nextInt();
		if(grade==1)      {System.out.println("1학년입니다!");}
		else if(grade==2) {System.out.println("2학년입니다!");}
		else if(grade==3) {System.out.println("3학년입니다!");}
		else              {System.out.println("1~3만 입력해주세요!");}
		
		int score;
		System.out.println("1~100점사이의 수입력:");
		score = sc.nextInt();
		if(score<101 && score>=90) {System.out.println("90점이상! 100이하");}
		else if(score<90 && score>=80)  {System.out.println("80점이상! 90미만");}
		else if(score<80 && score>=70)  {System.out.println("70점이상! 80미만");}
		else                            {System.out.println("70점 미만입니다.");}
	}}
