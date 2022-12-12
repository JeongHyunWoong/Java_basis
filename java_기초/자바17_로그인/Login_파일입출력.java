package 자바17_로그인;

import java.util.Scanner;

public class Login_파일입출력 {

	public static void main(String[] args) {
		File f = new File();
	}
}		
class File{
	Scanner sc = new Scanner(System.in);
	String name, age, add, number;

	File()
	{
		while(true)
		{
			System.out.println("파일입출력테스트");
			System.out.println("1.정보입력");
			System.out.println("2.정보출력");
			System.out.println("3.종료");
			System.out.print("선택:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				input();
			}
			else if(sel==2) 
			{
				output();
			}
			else if(sel==3) 
			{
				System.out.println("프로그램종료"); break;
			}
		}		
	}
	void input()
	{
		System.out.println("이름:"); name = sc.next();
		System.out.println("나이:"); age = sc.next();
		System.out.println("주소:"); add = sc.next();
		System.out.println("연락처:"); number = sc.next();
	}	
	void output()
	{
		System.out.println("이름:"+name+"\n나이:"+age+"\n주소:"+add+"\n연락처:"+number);
	}
}



