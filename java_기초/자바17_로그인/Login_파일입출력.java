package �ڹ�17_�α���;

import java.util.Scanner;

public class Login_��������� {

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
			System.out.println("����������׽�Ʈ");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:");
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
				System.out.println("���α׷�����"); break;
			}
		}		
	}
	void input()
	{
		System.out.println("�̸�:"); name = sc.next();
		System.out.println("����:"); age = sc.next();
		System.out.println("�ּ�:"); add = sc.next();
		System.out.println("����ó:"); number = sc.next();
	}	
	void output()
	{
		System.out.println("�̸�:"+name+"\n����:"+age+"\n�ּ�:"+add+"\n����ó:"+number);
	}
}



