package �ڹ�04_�������;

import java.util.Scanner;

public class while27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int kor, eng, mat, tot=0, avg=0;
		while(true)
		{	System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����:");
			select = sc.nextInt();
			
			if(select==1)
			{
			System.out.println("���������Է�:"); kor = sc.nextInt();
			System.out.println("���������Է�:"); eng = sc.nextInt();
			System.out.println("���������Է�:"); mat = sc.nextInt();
			tot=kor+eng+mat;
			avg=tot/3;
			}
			else if(select==2)
			{
			System.out.println("����:"+tot+"/���:"+avg);
			}
			else if(select==3)
			{System.out.print("���α׷�����"); break;}
			
		}
			
	}			
}			
				
		
			
		
