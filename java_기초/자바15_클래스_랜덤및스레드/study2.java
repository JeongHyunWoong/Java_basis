package �ڹ�15_Ŭ����_�����׽�����;

import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {
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
	    	System.out.println(count+"ȸ�õ�!!�������Ѽ�:"+dice); break;
	    	}
	    else
	    	{
	    	System.out.println("��~");
         	System.out.println(count+"ȸ�õ�!!��ǻ�ͼ�:"+dice);
	    	} 
	    	count++;
		}
	}
}



