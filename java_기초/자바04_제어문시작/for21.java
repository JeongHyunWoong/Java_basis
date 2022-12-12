package 자바04_제어문시작;

import java.util.Scanner;

public class for21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score, tot=0; // 점수,총점
		
		for(int n=0 ; n<5 ; n++)
		{	
			System.out.print(n+1+"번 학생의 점수(1~100):");
			score = sc.nextInt();
			tot=tot+score;
		}
		
		 System.out.println("총점수는="+tot);
			
		}}
		
		
			
			
			
		
