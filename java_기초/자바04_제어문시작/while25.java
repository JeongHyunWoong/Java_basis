package �ڹ�04_�������;

import java.util.Scanner;

public class while25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		while(true)
		{
			System.out.println("1.�Է�");
			System.out.println("2.���");
			System.out.println("3.����");
			System.out.print("����:");
			select = sc.nextInt();
			if(select==1)
			{System.out.print("�Է±���Դϴ�.");}			
			else if(select==2)
			{System.out.print("���±���Դϴ�.");}
			else if(select==3)
			{System.out.print("���α׷�����."); break;}
		}
	}	
}			
			
			
		
