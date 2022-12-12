package 자바14_thread;

public class study1_상속2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		Thread th = new Thread(t);
		th.start();
		while(true) 
		{
			try{
				Thread.sleep(2000);
				System.out.println("자바 수업 정말 재밌네요!(2초에한번동작)");
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
				System.out.println(count+"번 안녕하세요(1초에한번동작)");
			}catch(InterruptedException ie) {}
			count++;
		}
	}
}