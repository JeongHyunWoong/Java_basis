package 자바04_제어문시작;

import java.util.Scanner;

public class while23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan=2;
		while(dan<10)
		{	int su=1;
			while(su<10)
			{
				System.out.println(dan+"x"+su+"="+dan*su);
				su++;
			}
			
			dan++;
			
		}			
	}	
}			
			
			
		
