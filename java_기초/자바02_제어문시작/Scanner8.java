package �ڹ�02_�������;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, tot, avg;//����,����,����,����,���;		
		System.out.println("����"); kor = sc.nextInt();
		System.out.println("����"); eng = sc.nextInt();
		System.out.println("����"); mat = sc.nextInt();
		
		tot=kor+eng+mat;//�������ϱ�
		avg=tot/3;//��ձ��ϱ�..
		System.out.println("����:"+tot+"/���:"+avg);
	}

}
