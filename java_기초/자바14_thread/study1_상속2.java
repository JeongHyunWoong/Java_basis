package �ڹ�14_thread;

public class study1_���2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		Thread th = new Thread(t);
		th.start();
		while(true) 
		{
			try{
				Thread.sleep(2000);
				System.out.println("�ڹ� ���� ���� ��ճ׿�!(2�ʿ��ѹ�����)");
			}catch(InterruptedException ie) {}
		}
	}
}
class Test2 implements Runnable {
	public void run()
	{
		int count=1;
		while(true) 
		{
			try {
				Thread.sleep(1000);
				System.out.println(count+"�� �ȳ��ϼ���(1�ʿ��ѹ�����)");
			}catch(InterruptedException ie) {}
			count++;
		}
	}
}