package �ڹ�18_���Ϸα�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class study2_���������� {

	public static void main(String[] args) {
		Gbb gbb = new Gbb();
		gbb.start();
	}
}
class Gbb extends Thread{
	Scanner sc = new Scanner(System.in);
	int tot,win,draw,loss;//������ �� �� �� ����
	String myChoice;//������
	String ment="";
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
					if(com==0) {System.out.println("���º�!"); draw++;ment="���";}//��Ŵ
					if(com==1) {System.out.println("�����й�!"); loss++;ment="�й�";}//�й�
					if(com==2) {System.out.println("���ǽ¸�!"); win++;ment="�¸�";}//�¸�	
				}
				if(myChoice.equals("����"))
				{
					com(com);
					if(com==0) {System.out.println("���ǽ¸�!"); win++;ment="�¸�";}//�¸�
					if(com==1) {System.out.println("���º�!"); draw++;ment="���";}//���
					if(com==2) {System.out.println("�����й�!"); loss++;ment="�й�";}//�й�
				}
				if(myChoice.equals("��"))
				{
					com(com);
					if(com==0) {System.out.println("�����й�!"); loss++;ment="�й�";}//�й�
					if(com==1) {System.out.println("���ǽ¸�!"); win++;ment="�¸�";}//�¸�
					if(com==2) {System.out.println("���º�!"); draw++;ment="���";}//���
				}
				try {
					Thread.sleep(1000);	
					//���� �ð����ϱ� �ʱ���...
		            Date nowDate = new Date();
		        	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("��� yyyy�� MM�� dd�� hh�� mm�� ss��");      
		        	String now = simpleDateFormat.format(nowDate);
					//���� ��ü ������ ���
			        File file = new File("C:\\aaa\\work\\data07111.txt");
			        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
			        bufferedWriter.write("�ºδ�?:"+ment+now);
			        bufferedWriter.newLine();
			        bufferedWriter.close();
			            
			        System.out.println(now);
	            	
				} catch (InterruptedException e) {								
					e.printStackTrace();
			}       
	        catch (IOException e) {
	            System.out.println(e);
	        }
			}
			else if(sel==2) 
			{ 			        
				System.out.println("������:"+tot);
				System.out.println("�¸�:"+win);
				System.out.println("�й�:"+loss);
				System.out.println("���º�:"+draw);
				try{
		            //���� ��ü ����
		            File file = new File("C:\\aaa\\work\\data07111.txt");
		            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
		                //����
		            	bufferedWriter.write("������:"+tot);
		                bufferedWriter.newLine();
		                bufferedWriter.write("�¸�:"+win);
		                bufferedWriter.newLine();
		                bufferedWriter.write("�й�:"+loss);
		                bufferedWriter.newLine();
		                bufferedWriter.write("���º�:"+draw);
		                bufferedWriter.newLine();
		                  
		                bufferedWriter.close();
		        }catch (IOException e) {
		            System.out.println(e);
		        }
			}
			else if(sel==3) 
			{System.out.println("���α׷�����"); break;}
		}
	}
	
	void com(int sel)
	{
		if(sel==0) 		{System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");}
		else if(sel==1) {System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");}
		else if(sel==2) {System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");}
	}
	
}



