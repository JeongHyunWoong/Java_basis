package �ڹ�11_����������;

import java.util.Scanner;

public class ����������2 {

	public static void main(String[] args) {
		Friends t = new Friends();
	}
}
class Friends{
	Scanner sc = new Scanner(System.in);
	String name[] = new String[100];
	String phone[] = new String[100];
	String area[] = new String[100];
	String sex[] = new String[100];
	int age[] = new int[100];
	int count=0;
	
	Friends()
	{
		while(true)
		{
			System.out.println("1.ģ���߰�");
			System.out.println("2.ģ����ü����");
			System.out.println("3.����");
			System.out.print("����:");
			int select = sc.nextInt();
			
			if(select==1)
			{
				input();
			}
			else if(select==2)
			{
				output();
			}
			else if(select==3)
			{
				System.out.println("���α׷�����"); break;
			}
		}	
	}
	void input()
	{
		System.out.print("�̸�:"); name[count] = sc.next();
		System.out.print("����:"); phone[count] = sc.next();
		System.out.print("����:"); area[count] = sc.next();
		System.out.print("����:"); sex[count] = sc.next();
		System.out.print("����:"); age[count] = sc.nextInt();
		count++;
	}
	void output()
	{
		for(int i=0 ; i<count ; i++)
		System.out.println(i+1+"�� �л�"+name[i]+"/����:"+phone[i]+"/����:"+area[i]+"/����:"+sex[i]+"/����"+age[i]);
	}
}
