package �ڹ�02_�������;

import java.util.Scanner;

public class switch14 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String grade;
		System.out.println("������ �Է��ϼ���"); grade = sc.next();
		
		switch(grade)
		{
		case "A" : System.out.println("90��~100���Դϴ�."); break;
		case "B" : System.out.println("80��~90���̸��Դϴ�."); break;
		case "C" : System.out.println("70��~80���̸��Դϴ�."); break;
		case "F" : System.out.println("70���̸��Դϴ�."); break;
		}
		String name;
		System.out.println("�̸��� �Է��ϼ���"); name = sc.next();
		
		switch(name)
		{
		case "ȫ�浿" : System.out.println("������½������½ �������!"); break;
		case "������" : System.out.println("�Ϳ�~! ��� �̻� ���̵�!"); break;
		case "�̺���" : System.out.println("�θ�ƽ ������! �̰� �����! ����!"); break;
		case "������" : System.out.println("��� �����մϴ�!"); break;
	}}}
