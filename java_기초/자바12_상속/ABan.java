package �ڹ�12_���;

import java.util.Scanner;

public class ABan extends Score{
	Scanner sc = new Scanner(System.in);
	int soc=0,sci=0,tot=0,avg=0;
	int select;
	ABan(){
		while(true)
		{
			System.out.println("<A�� ��������� ���ϱ�>");
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
		System.out.println("��ȸ:"); soc = sc.nextInt();
		System.out.println("����:"); sci = sc.nextInt();
		tot = kor+eng+mat+soc+sci;
		avg = tot/5;
	}
	void output()
	{
		System.out.println("����:"+tot+"/���:"+avg);
	}
}


	


