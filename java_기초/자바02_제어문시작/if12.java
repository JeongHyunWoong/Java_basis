package 자바02_제어문시작;

import java.util.Scanner;

public class if12 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int avg,kor,eng,mat;
		System.out.println("국어:"); kor = sc.nextInt();
		System.out.println("영어:"); eng = sc.nextInt();
		System.out.println("수학:"); mat = sc.nextInt();
		avg = (kor+eng+mat)/3;
		if(avg<101 && avg>=90)      {System.out.println("참잘했어요!");}
		else if(avg<90 && avg>=80)  {System.out.println("우수합니다!");}
		else                        {System.out.println("힘내세요!");}
	}}
