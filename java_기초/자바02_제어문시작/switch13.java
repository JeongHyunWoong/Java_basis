package �ڹ�02_�������;

import java.util.Scanner;

public class switch13 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int grade;
		System.out.println("���л��г��� �Է��ϼ���");
		grade = sc.nextInt();
		switch(grade)
		{
		case 1 : System.out.println("1�г��Դϴ�!"); break;
		case 2 : System.out.println("2�г��Դϴ�!"); break;
		case 3 : System.out.println("3�г��Դϴ�!"); break;
		//default : System.out.println("1~3�� �Է����ּ���!");
		}
	}}
