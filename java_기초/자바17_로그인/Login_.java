package 자바17_로그인;

import java.util.Scanner;

public class Login_ {

	public static void main(String[] args) {
		Login l = new Login();
	}
}		
class Login{
	Scanner sc = new Scanner(System.in);
	private String id = "hong";
	private String pw = "1234";
	String userId[] = new String[100];
	String userPw[] = new String[100];
	String name[] = new String[100];
	String pn[] = new String[100];
	int count = 0;

	Login()
	{
		while(true)
		{
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.println("선택:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				System.out.println("아이디:"); String userId = sc.next();
				System.out.println("비밀번호:"); String userPw = sc.next();
				login(userId,userPw);
			}
			else if(sel==2) 
			{
					System.out.println("신규회원가입");
					System.out.println("아이디:"); userId[count] = sc.next();
					System.out.println("비밀번호:"); userPw[count] = sc.next();
					System.out.println("이름:"); name[count] = sc.next();
					System.out.println("전화번호:"); pn[count] = sc.next();
					count++;
			}
			else if(sel==3) 
			{
				System.out.println("프로그램종료"); break;
			}
		}		
	}
	void login(String id, String pw) {
		if(this.id.equals(id))
		{
			if(this.pw.equals(pw))
			{
				System.out.println("관리자로 로그인 되었습니다.");
				while(true)
				{
					System.out.println("1.회원전체보기");
					System.out.println("2.로그아웃");
					System.out.println("3.종료");
					System.out.println("선택:");
					int sel = sc.nextInt();
					if(sel==1) 
					{
						qwe();
					}
					else if(sel==2) {}
					else if(sel==3) {}
				}
			}
		}
	}
	void qwe() {
		for(int i=0; i<count; i++)
		{
			System.out.println(i+1+"번"+userId[i]+"/"+name[i]+"/"+pn[i]);
		}
				
	}
}



