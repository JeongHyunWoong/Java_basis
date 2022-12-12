package 자바02_제어문시작;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot, avg;//국어,영어,수학,총점,평균;		
		System.out.println("국어"); kor = sc.nextInt();
		System.out.println("영어"); eng = sc.nextInt();
		System.out.println("수학"); mat = sc.nextInt();
		
		tot=kor+eng+mat;//총점구하기
		avg=tot/3;//평균구하기..
		System.out.println("총점:"+tot+"/평균:"+avg);
	}

}
