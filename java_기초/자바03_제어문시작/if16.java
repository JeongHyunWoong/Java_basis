package �ڹ�03_�������;

import java.util.Scanner;

public class if16 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String name;
		double height,weight;
		int age;
		
		System.out.println("�̸�:"); name = sc.next();
		System.out.println("����:"); age = sc.nextInt();
		System.out.println("Ű:"); height = sc.nextDouble();
		System.out.println("������:"); weight = sc.nextDouble();
		
		if		(20<=age && age<30 && 180.0<=height && height<190.0
				&& 70<=weight && weight<80)      
				{System.out.println("����� �Ƴ��Դϴ�!");}
		else if(31<=age && age<38 && 175.0<=height && height<185.0
				&& 75<=weight && weight<89)  
				{System.out.println("����� ���߳��Դϴ�!");}
		else    {System.out.println("����� �����Դϴ�.");}
	}}
