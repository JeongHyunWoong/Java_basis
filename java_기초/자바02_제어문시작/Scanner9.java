package 자바02_제어문시작;

import java.util.Scanner;

public class Scanner9 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int appleboxcount, applebox, appleprice, appletotal, totalprice;
		int sellapple, 남은갯수, 판매금액;
		System.out.println("사과박스당갯수"); appleboxcount = sc.nextInt();
		System.out.println("사과박스갯수"); applebox = sc.nextInt();
		System.out.println("사과가격"); appleprice = sc.nextInt();
		
		appletotal=appleboxcount*applebox;//총갯수구하기
		totalprice=appletotal*appleprice;//총가격구하기
		System.out.println("총갯수:"+appletotal+"개"+"/총가격:"+totalprice+"원");
		
		System.out.println("판매된사과갯수"); sellapple = sc.nextInt();
		
		남은갯수 = appletotal-sellapple;//남은갯수구하기
		판매금액 = sellapple*appleprice;//판매금액구하기
		System.out.println("남은갯수:"+(appletotal-sellapple)+"개"+
		"/판매금액:"+sellapple*appleprice+"원");
		
		
	}

}
