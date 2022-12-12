package 자바05_배열시작;

import java.util.Scanner;

public class num배열4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[3];
		int kor[] = new int[3];
		int eng[] = new int[3];
		int mat[] = new int[3];
		int tot[] = new int[3];
		int avg[] = new int[3];
		
		for(int i=0; i<name.length; i++)
		{
			System.out.print(i+1+"번 학생 이름:");
			name[i] = sc.next();
			System.out.print(i+1+"번 학생 국어:");
			kor[i] = sc.nextInt();
			System.out.print(i+1+"번 학생 영어:");
			eng[i] = sc.nextInt();
			System.out.print(i+1+"번 학생 수학:");
			mat[i] = sc.nextInt();
			
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3;
		}
		for(int i=0; i<name.length; i++)
		{
			System.out.println
			(i+1+"번 학생"+name[i]+"총점:"+tot[i]+"/평균:"+avg[i]);
		}
		
		

	}

}
