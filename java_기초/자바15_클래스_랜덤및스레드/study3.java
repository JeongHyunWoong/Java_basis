package �ڹ�15_Ŭ����_�����׽�����;

import java.util.Scanner;

public class study3 {

	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.start();
	}
}
class Dice extends Thread{	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int my;
    	System.out.print("�� ���� ���ϱ�(1~6):");
    	my = sc.nextInt();
    	System.out.print("����!!");
    	int count=1;
		while(true) 
		{
			int dice = (int)(Math.random()*6+1);
			try {
	    		Thread.sleep(1000);
	    	}catch(InterruptedException ie) {}
	    if(my == dice)
	    	{ 	
	    	System.out.println("������~");
	    	System.out.println(count+"ȸ�õ�!!��ǻ�ͼ�:"+dice); break;
	    	}
	    else
	    	{
	    	try {
	    		Thread.sleep(1000);
	    		System.out.println("��~");
	    	}catch(InterruptedException ie) {}
	    		System.out.println("�������Ѽ�:"+my+"/��ǻ�ͼ�:"+dice);
	    	} 
	    	count++;
		}
	}
}



