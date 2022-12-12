package 자바03_제어문시작;

import java.util.Scanner;

public class for18 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력하세요:");
		int dan = sc.nextInt();
		
		for(int i=1 ; i<10 ; i++)
		{
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		}}
