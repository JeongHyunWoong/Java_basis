package 자바03_제어문시작;

import java.util.Scanner;

public class if16 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String name;
		double height,weight;
		int age;
		
		System.out.println("이름:"); name = sc.next();
		System.out.println("나이:"); age = sc.nextInt();
		System.out.println("키:"); height = sc.nextDouble();
		System.out.println("몸무게:"); weight = sc.nextDouble();
		
		if		(20<=age && age<30 && 180.0<=height && height<190.0
				&& 70<=weight && weight<80)      
				{System.out.println("당신은 훈남입니다!");}
		else if(31<=age && age<38 && 175.0<=height && height<185.0
				&& 75<=weight && weight<89)  
				{System.out.println("당신은 꽃중년입니다!");}
		else    {System.out.println("당신은 루저입니다.");}
	}}
