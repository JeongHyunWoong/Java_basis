package 자바02_제어문시작;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("내 키를 입력하세요.");
		double height = sc.nextDouble();
		
		System.out.println("내이름은:"+name);
		System.out.println("내나이는:"+age+"살");
		System.out.println("내키는:"+height+"cm");
	}

}
