package �ڹ�16_Ŭ����_2;

import java.util.Scanner;

public class study5_aircon {

	public static void main(String[] args) {
		Air air = new Air();
	}
}
class Air extends Thread{
	Scanner sc = new Scanner(System.in);
	int nowC=25; //����µ�
	int chaC=20; //�����µ�
	boolean runCheck = false;//�������� �������� //boolean = ��/����
	Air()
	{
		start();//������ ������....
		while(true)
		{
			System.out.println("[����µ�:"+nowC+"��/�����µ�:"+chaC+"��]");
			System.out.println("1.����������");
			System.out.println("2.�µ�����");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel ==1 ) {
				System.out.println("�������� �����˴ϴ�.");
				runCheck =true;
				
			}
			else if(sel ==2 ) {
				System.out.println();
				System.out.println("[�����µ�"+chaC+"��]");
				System.out.print("�µ�����:"); chaC = sc.nextInt();
				System.out.println();
			}
			else if(sel ==3 ) {break;}
	}
}
	public void run() {
		while(true)
		{
			//runCheck �� ������ �����ϱ� ���ؼ� ��� ������ ����
			try {
				sleep(1000);
			}catch(InterruptedException e) {}
			
			if(runCheck==true)
			{
				int rnd = (int)(Math.random()*2);
				try {
					nowC-= rnd;
					sleep(1000);
					System.out.println("����µ�: "+nowC+"��");
				} catch (InterruptedException e) {}
				if(nowC==chaC)
				{
					System.out.println("�����µ� ����! �۵�����!");
					runCheck=false;
				}
			}
		}
	}
}

	




