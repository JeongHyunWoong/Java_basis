package �ڹ�12_���;

import java.util.Scanner;

public class BBan extends Score{
	Scanner sc = new Scanner(System.in);
	int mus=0,art=0,tot=0,avg=0;
	int select;
	BBan(){
		while(true)
		{
			System.out.println("<B�� ���������� ���ϱ�>");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
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
		super.input();
		System.out.println("����:"); mus = sc.nextInt();
		System.out.println("�̼�:"); art = sc.nextInt();
		tot = kor+eng+mat+mus+art;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("����:"+tot+"/���:"+avg);
	}
}


	


