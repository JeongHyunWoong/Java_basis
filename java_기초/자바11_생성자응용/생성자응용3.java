package �ڹ�11_����������;

import java.util.Scanner;

public class ����������3 {

	public static void main(String[] args) {
		Account a = new Account();
	}
}
class Account{
	Scanner sc = new Scanner(System.in);
	String id[] = new String[100];
	String pw[] = new String[100];
	String name[] = new String[100];
	int cash[] = new int[100];
	int count=0;
	
	Account()
	{
		while(true)
		{
			System.out.println("1.���»���");
			System.out.println("2.������ȸ");
			System.out.println("3.�Ա��ϱ�");
			System.out.println("4.����ϱ�");
			System.out.println("5.��ü������ȸ");
			System.out.println("6.���α׷�����");
			System.out.print("����:");
			int select = sc.nextInt();
			
			if(select==1)
			{
				accCreate();
			}
			else if(select==2)
			{		
				select();
			}
			else if(select==3)
			{
				inCash();
			}
			else if(select==4)
			{
				outCash();
			}
			else if(select==5)
			{
				selectAll();
			}
			else if(select==6)
			{
				System.out.println("���α׷�����"); break;
			}
		}	
	}
	void accCreate() 
	{
		System.out.println("���¹�ȣ:"); id[count] = sc.next();
		System.out.println("��й�ȣ:"); pw[count] = sc.next();
		System.out.println("�̸�:"); name[count] = sc.next();
		System.out.println("�Աݾ�:"); cash[count] = sc.nextInt();
		count++;
	}
	void select()
	{
		System.out.println("���¹�ȣ:"); String inputId=sc.next();
		System.out.println("��й�ȣ:"); String inputPw=sc.next();
		for(int i=0; i<count; i++)
		{
			if(id[i].equals(inputId))
			{
				if(pw[i].equals(inputPw))
				{
					System.out.println("\n�ܾ�:"+cash[i]);
				}
			}
		}
	}
	void inCash() 
	{
		System.out.println("���¹�ȣ:"); String inputId=sc.next();
		System.out.println("�Աݾ�:"); int inputCash = sc.nextInt();
		for(int i=0; i<count; i++)
			{
			if(id[i].equals(inputId))
				{
					//cash[i] - cash[i]+inputCash;
					cash[i] += inputCash;
					System.out.println("�Ѿ�:"+cash[i]);
				}	
			}
	}
	void outCash() 
	{
		System.out.println("���¹�ȣ:"); String inputId=sc.next();
		System.out.println("��й�ȣ:"); String inputPw=sc.next();
		System.out.println("��ݾ�:"); int outputCash = sc.nextInt();
		for(int i=0; i<count; i++)
			{
			if(id[i].equals(inputId))
				{
				if(pw[i].equals(inputPw))
					{
						cash[i] -= outputCash;;
						System.out.println("�Ѿ�:"+cash[i]);
					}
				}
			}
	}
	void selectAll() 
	{
		for(int i=0; i<count; i++)
		{
			System.out.println("���¹�ȣ:"+id[i]+"/�����ָ�:"+name[i]+"/�ܾ�:"+cash[i]);
		}
	}
}
