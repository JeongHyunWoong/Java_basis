package �ڹ�17_�α���;

import java.util.Scanner;

public class Login_�α����� {

	public static void main(String[] args) {
		Pp p = new Pp();
	}
}		
class Pp{
	Scanner sc = new Scanner(System.in);
	int SG, JG, DG, UG, DDG; //���� �߱� ���� ������ �����
	int tot;
	int count = 0;

	Pp()
	{
		while(true)
		{
			System.out.println("<�����α��������α׷�>");
			System.out.println("1.�α��Է�");
			System.out.println("2.�α�����");
			System.out.println("3.����");
			System.out.println("����:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				System.out.println("����(����:��):"); SG = sc.nextInt();
				System.out.println("�߱�(����:��):"); JG = sc.nextInt();
				System.out.println("����(����:��):"); DG = sc.nextInt();
				System.out.println("������(����:��):"); UG = sc.nextInt();
				System.out.println("�����(����:��):"); DDG = sc.nextInt();
			}
			else if(sel==2) 
			{
				pp();
			}
			else if(sel==3) 
			{
				System.out.println("���α׷�����"); break;
			}
		}		
	}
	void pp()
	{
		tot=SG+JG+DG+UG+DDG;
		{
			System.out.println("�������α�:"+tot+"����");
			System.out.println("����:"+SG+"��"+"/�߱�:"+JG+"��"+"/����:"+DG+"��"+"/������:"+UG+"��"+"/�����:"+DDG+"��");
		}
	}	
}



