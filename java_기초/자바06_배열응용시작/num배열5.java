package �ڹ�06_�迭�������;

import java.util.Scanner;

public class num�迭5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		String name="";
		String phone="";
		String add="";
		
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.print("����:");
			select = sc.nextInt();
			
			if(select==1)
			{
				System.out.print("�̸�:"); name = sc.next();
				System.out.print("����:"); phone = sc.next();
				System.out.print("�ּ�:"); add = sc.next();
			}
			else if(select==2)
			{
				System.out.println("�̸�:"+name+"/����:"+phone+"/�ּ�:"+add);
			}
		}
	}

}
