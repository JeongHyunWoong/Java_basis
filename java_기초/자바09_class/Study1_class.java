package �ڹ�09_class;

import java.util.Scanner;

public class Study1_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fan f = new Fan();
		int select;
		System.out.println("[��ǳ�� ��������]");
		System.out.println("��ǳ���:"+f.name);
		System.out.println("����:"+f.power+"/ȸ��:"+f.rotate);
		System.out.println("�ӵ�:"+f.speed+"/����:"+f.headControl);
		System.out.println("1.�����ѱ�");
		System.out.println("2.����");
		System.out.println("����:");
		select = sc.nextInt();
		if(select==1)
			{System.out.println("��ǳ�� ������ ���Խ��ϴ�.");
			 f.power = true;}
		while(f.power)
		{	
			System.out.println("[��ǳ�� ��������]");
			System.out.println("��ǳ���:"+f.name);
			System.out.println("����:"+f.power+"/ȸ��:"+f.rotate);
			System.out.println("�ӵ�:"+f.speed+"/����:"+f.headControl);
			System.out.println("1.ȸ������");
			System.out.println("2.�ӵ�����");
			System.out.println("3.��������");
			System.out.println("4.����");
			System.out.println("����:");
			select = sc.nextInt();
			if(select==1)
			{
				System.out.println("���������� �����ֽ��ϴ�.");
				System.out.println("��ǳ�⸦ ȸ���Ͻðڽ��ϱ�?(y,n):");
				String ok = sc.next();
				if(ok.equals("y"))
				{
					System.out.println("��ǳ�� ȸ���� �����մϴ�.");
					f.rotate = true;
				}
				else
				{
					System.out.println("�߸��Է��ؼ� ȸ�� �̵���");
				}
			}
			else if(select==2)
			{
				System.out.println("����ӵ��� �����Դϴ�.");
				System.out.println("ǳ�Ӽ���(1.��ǳ,2.��ǳ,3.��ǳ):");
				int ok = sc.nextInt();
				if(ok==0)
				{
					System.out.println("�ȵ��ư��ϴ�.");
					f.speed = 0;
				}
				else if(ok==1)
				{	
					System.out.println("��ǳ���� �����մϴ�.");
					f.speed = 1;
				}
				else if(ok==2)
				{
					System.out.println("��ǳ���� �����մϴ�.");
					f.speed = 2;
				}
				else if(ok==3)
				{
					System.out.println("��ǳ���� �����մϴ�.");
					f.speed = 3;
				}
			}
			else if(select==3)
			{
				System.out.println("����Ʒ� �����Դϴ�.");
				System.out.println("��带 �ø��ðڽ��ϱ�?(y,n):");
				String ok = sc.next();
				if(ok.equals("y"))
				{
					System.out.println("��ǳ�� ��尡 ���� �ö󰩴ϴ�.");
					f.headControl = true;
				}
				else if(ok.equals("n"))
				{
					System.out.println("��ǳ�� ��尡 �����˴ϴ�.");
					f.headControl = true;
				}
			}
			else if(select==4)
			{
				System.out.print("���α׷�����"); break;}
			}
			
	}
}
class Fan{
	boolean power = false; //����
	boolean rotate = false; //ȸ��
	int speed = 0; //0���� 1:��ǳ 2:��ǳ 3:��ǳ
	boolean headControl = false; //���Ʒ�
	String name="����̵���ǳ��";
	
	void power() { System.out.println("�������������ϴ�.");}
	void rotate() { System.out.println("ȸ������Դϴ�.");}
	void speed() { System.out.println("���� ��ǳ�Դϴ�.");}
	void headControl() { System.out.println("������������");}
	void name() { System.out.println("�̸��� ����Ǿ����ϴ�.");}
}
