package �ڹ�02_�������;

import java.util.Scanner;

public class if11 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int grade;
		System.out.println("���л��г��� �Է��ϼ���:");
		grade = sc.nextInt();
		if(grade==1)      {System.out.println("1�г��Դϴ�!");}
		else if(grade==2) {System.out.println("2�г��Դϴ�!");}
		else if(grade==3) {System.out.println("3�г��Դϴ�!");}
		else              {System.out.println("1~3�� �Է����ּ���!");}
		
		int score;
		System.out.println("1~100�������� ���Է�:");
		score = sc.nextInt();
		if(score<101 && score>=90) {System.out.println("90���̻�! 100����");}
		else if(score<90 && score>=80)  {System.out.println("80���̻�! 90�̸�");}
		else if(score<80 && score>=70)  {System.out.println("70���̻�! 80�̸�");}
		else                            {System.out.println("70�� �̸��Դϴ�.");}
	}}
