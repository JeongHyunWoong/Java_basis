package �ڹ�02_�������;

import java.util.Scanner;

public class if12 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int avg,kor,eng,mat;
		System.out.println("����:"); kor = sc.nextInt();
		System.out.println("����:"); eng = sc.nextInt();
		System.out.println("����:"); mat = sc.nextInt();
		avg = (kor+eng+mat)/3;
		if(avg<101 && avg>=90)      {System.out.println("�����߾��!");}
		else if(avg<90 && avg>=80)  {System.out.println("����մϴ�!");}
		else                        {System.out.println("��������!");}
	}}
