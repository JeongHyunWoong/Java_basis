package �ڹ�15_Ŭ����_�����׽�����;

import java.util.Scanner;

public class study4_���������� {

	public static void main(String[] args) {
		Gbb gbb = new Gbb();
		gbb.start();
	}
}
class Gbb extends Thread{
	Scanner sc = new Scanner(System.in);
	int tot,win,draw,loss;//������ �� �� �� ����
	String myChoice;//������
	public void run()
	{
		System.out.println("<<��������������!>>");
		while(true)
		{
			System.out.println("1.���ӽ���");
			System.out.println("2.��躸��");
			System.out.println("3.����");
			System.out.println("����:");
			int sel = sc.nextInt();
			if(sel==1) {
				tot++;//���ӽ��۸��ϸ� �׳� ���� ������..
				System.out.print("������:"); myChoice = sc.next();
				for(int i=3; i>0; i--)
				{
					try {
			    		sleep(1000);
			    	}catch(InterruptedException ie) {}
					System.out.println(i);
				}
				int com = (int)(Math.random()*3);//0:���� 1:���� 2:��
				if(myChoice.equals("����"))
				{
					com(com);
					if(com==0) {System.out.println("���º�!"); draw++;}//��Ŵ
					if(com==1) {System.out.println("�����й�!"); loss++;}//�й�
					if(com==2) {System.out.println("���ǽ¸�!"); win++;}//�¸�
				if(myChoice.equals("����"))
				{
					com(com);
					if(com==0) {System.out.println("���ǽ¸�!"); win++;}//�¸�
					if(com==1) {System.out.println("���º�!"); draw++;}//���
					if(com==2) {System.out.println("�����й�!"); loss++;}//�й�
				}
				if(myChoice.equals("��"))
				{
					com(com);
					if(com==0) {System.out.println("�����й�!"); loss++;}//�й�
					if(com==1) {System.out.println("���ǽ¸�!"); win++;}//�¸�
					if(com==2) {System.out.println("���º�!"); draw++;}//���
				}
			}
			else if(sel==2) {
				System.out.println("������:"+tot);
				System.out.println("�¸�:"+win); 
				System.out.println("�й�:"+loss); 
				System.out.println("���º�:"+draw); 
			}
			else if(sel==3) 
			{System.out.println("���α׷�����"); break;}
			}
		}
	}
	
	void com(int sel)
	{
		if(sel==0) 		{System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");}
		else if(sel==1) {System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");}
		else if(sel==2) {System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");}
	}
	
}



