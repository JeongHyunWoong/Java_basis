package �ڹ�14_thread;

public class study1_��� {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.start();
		while(true) 
		{
			try {
				Thread.sleep(2000);
				System.out.println("�ڹ� ���� ���� ��ճ׿�!(2�ʿ��ѹ�����)");
			}catch(InterruptedException ie) {}
		}
	}
}
class Test1 extends Thread {
	public void run() {
		int count=1;
		while(true)
		{
			try {
				sleep(1000);
				System.out.println(count+"�� �ȳ��ϼ���(1�ʿ��ѹ�����)");
			}catch(InterruptedException ie) {}
			count++;
		}
	}
}