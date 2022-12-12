package 자바11_생성자응용;

import java.util.Scanner;

public class 생성자응용1 {

	public static void main(String[] args) {
		cal t = new cal();
	}
}
class cal{
	Scanner sc = new Scanner(System.in);
	int su1,su2,result;
	String yon;
	void add(int su1, int su2) {
		result=su1+su2; System.out.println("결과:"+result);}
	void min(int su1, int su2) {
		result=su1-su2; System.out.println("결과:"+result);}
	void mul(int su1, int su2) {
		result=su1*su2; System.out.println("결과:"+result);}
	void div(int su1, int su2) {
		result=su1/su2; System.out.println("결과:"+result);}
	
	cal()
	{
		while(true)
		{
			System.out.println("1.계산하기");
			System.out.println("2.종료");
			System.out.print("선택:");
			int select = sc.nextInt();
			
			if(select==1)
			{
				System.out.print("첫번째수:"); su1=sc.nextInt();
				System.out.print("두번째수:"); su2=sc.nextInt();
				System.out.print("연산자선택(+,-,*,/):"); yon = sc.next();
				System.out.print("결과:");
				
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
				System.out.println("프로그램종료"); break;
			}
		}	
	}

}
