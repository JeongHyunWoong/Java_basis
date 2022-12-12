package 자바06_배열응용시작;

import java.util.Scanner;

public class num배열5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		String name="";
		String phone="";
		String add="";
		
		while(true)
		{
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.정보검색");
			System.out.println("4.종료");
			System.out.print("선택:");
			select = sc.nextInt();
			
			if(select==1)
			{
				System.out.print("이름:"); name = sc.next();
				System.out.print("전번:"); phone = sc.next();
				System.out.print("주소:"); add = sc.next();
			}
			else if(select==2)
			{
				System.out.println("이름:"+name+"/전번:"+phone+"/주소:"+add);
			}
		}
	}

}
