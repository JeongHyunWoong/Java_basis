package �ڹ�02_�������;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.next();
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		System.out.println("�� Ű�� �Է��ϼ���.");
		double height = sc.nextDouble();
		
		System.out.println("���̸���:"+name);
		System.out.println("�����̴�:"+age+"��");
		System.out.println("��Ű��:"+height+"cm");
	}

}
