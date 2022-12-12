package 자바12_상속;

import java.util.Scanner;

public class Score{
	Scanner sc = new Scanner(System.in);
	int kor,eng,mat;

	void input() 
	{
		System.out.println("국어:"); kor = sc.nextInt();
		System.out.println("영어:"); eng = sc.nextInt();
		System.out.println("수학:"); mat = sc.nextInt();
	}
}
	


