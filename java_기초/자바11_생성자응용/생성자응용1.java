package �ڹ�11_����������;

import java.util.Scanner;

public class ����������1 {

	public static void main(String[] args) {
		cal t = new cal();
	}
}
class cal{
	Scanner sc = new Scanner(System.in);
	int su1,su2,result;
	String yon;
	void add(int su1, int su2) {
		result=su1+su2; System.out.println("���:"+result);}
	void min(int su1, int su2) {
		result=su1-su2; System.out.println("���:"+result);}
	void mul(int su1, int su2) {
		result=su1*su2; System.out.println("���:"+result);}
	void div(int su1, int su2) {
		result=su1/su2; System.out.println("���:"+result);}
	
	cal()
	{
		while(true)
		{
			System.out.println("1.����ϱ�");
			System.out.println("2.����");
			System.out.print("����:");
			int select = sc.nextInt();
			
			if(select==1)
			{
				System.out.print("ù��°��:"); su1=sc.nextInt();
				System.out.print("�ι�°��:"); su2=sc.nextInt();
				System.out.print("�����ڼ���(+,-,*,/):"); yon = sc.next();
				System.out.print("���:");
				
				switch(yon) 
				{
				case "+" : result=su1+su2; break;
				case "-" : result=su1-su2; break;
				case "*" : result=su1*su2; break;
				case "/" : result=su1/su2; break;
				}
				System.out.println(result);
				}
			
			else if(select==2)
			{
				System.out.println("���α׷�����"); break;
			}
		}	
	}

}
