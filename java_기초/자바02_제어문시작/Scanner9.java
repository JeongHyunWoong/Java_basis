package �ڹ�02_�������;

import java.util.Scanner;

public class Scanner9 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int appleboxcount, applebox, appleprice, appletotal, totalprice;
		int sellapple, ��������, �Ǹűݾ�;
		System.out.println("����ڽ��簹��"); appleboxcount = sc.nextInt();
		System.out.println("����ڽ�����"); applebox = sc.nextInt();
		System.out.println("�������"); appleprice = sc.nextInt();
		
		appletotal=appleboxcount*applebox;//�Ѱ������ϱ�
		totalprice=appletotal*appleprice;//�Ѱ��ݱ��ϱ�
		System.out.println("�Ѱ���:"+appletotal+"��"+"/�Ѱ���:"+totalprice+"��");
		
		System.out.println("�ǸŵȻ������"); sellapple = sc.nextInt();
		
		�������� = appletotal-sellapple;//�����������ϱ�
		�Ǹűݾ� = sellapple*appleprice;//�Ǹűݾױ��ϱ�
		System.out.println("��������:"+(appletotal-sellapple)+"��"+
		"/�Ǹűݾ�:"+sellapple*appleprice+"��");
		
		
	}

}
