package �ڹ�06_�迭�������;

import java.util.Scanner;

public class num�迭6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int MAX=3;
		String name[] = new String[MAX];
		String phone[] = new String[MAX];
		String add[] = new String[MAX];
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.print("����:");
			select = sc.nextInt();
			
			if(select==1)
				for(int i=0; i<name.length; i++)
			{
				System.out.print(i+1+"�� �̸�:"); name[i] = sc.next();
				System.out.print(i+1+"�� ����:"); phone[i] = sc.next();
				System.out.print(i+1+"�� �ּ�:"); add[i] = sc.next();
			}
			else if(select==2)
				for(int i=0; i<name.length; i++)
			{
				System.out.println
				(i+1+"��"+name[i]+"/"+phone[i]+"/"+add[i]);
			}
			else if(select==3)
				for(int i=0; i<name.length; i++)
				{	System.out.print("�˻��̸�:");
					String search = sc.next();
			
					if(search.equals(name[i]))
				{
					System.out.println
					(i+1+"��"+name[i]+"/"+phone[i]+"/"+add[i]);
				}
			
				}
			else if(select==4)
				{System.out.print("���α׷�����"); break;}
		}
	}

}
