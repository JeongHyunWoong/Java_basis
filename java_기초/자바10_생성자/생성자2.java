package �ڹ�10_������;

import java.util.Scanner;

public class ������2 {

	public static void main(String[] args) {
		score t = new score();
	}
}
class score{
	Scanner sc = new Scanner(System.in);
	int kor,eng,mat,tot,avg;
	score()
	{
		while(true)
		{
			System.out.println("<�������>");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.println("����:");
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
	System.out.println("����:"); kor=sc.nextInt();
	System.out.println("����:"); eng=sc.nextInt();
	System.out.println("����:"); mat=sc.nextInt();
	tot = kor+eng+mat;
	avg = tot/3;
	}
	void output()
	{
		System.out.println("����:"+tot+"/���:"+avg);
	}
}
