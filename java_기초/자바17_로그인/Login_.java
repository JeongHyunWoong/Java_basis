package �ڹ�17_�α���;

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
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.����");
			System.out.println("����:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				System.out.println("���̵�:"); String userId = sc.next();
				System.out.println("��й�ȣ:"); String userPw = sc.next();
				login(userId,userPw);
			}
			else if(sel==2) 
			{
					System.out.println("�ű�ȸ������");
					System.out.println("���̵�:"); userId[count] = sc.next();
					System.out.println("��й�ȣ:"); userPw[count] = sc.next();
					System.out.println("�̸�:"); name[count] = sc.next();
					System.out.println("��ȭ��ȣ:"); pn[count] = sc.next();
					count++;
			}
			else if(sel==3) 
			{
				System.out.println("���α׷�����"); break;
			}
		}		
	}
	void login(String id, String pw) {
		if(this.id.equals(id))
		{
			if(this.pw.equals(pw))
			{
				System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");
				while(true)
				{
					System.out.println("1.ȸ����ü����");
					System.out.println("2.�α׾ƿ�");
					System.out.println("3.����");
					System.out.println("����:");
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
			System.out.println(i+1+"��"+userId[i]+"/"+name[i]+"/"+pn[i]);
		}
				
	}
}



