package �ڹ�06_�迭�������;

import java.util.Scanner;

public class num�迭8_2���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int MAX=2;
		String name[][] = new String[MAX][MAX];
		String phone[][] = new String[MAX][MAX];
		String add[][] = new String[MAX][MAX];
		while(true)
		{
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.�����˻�");
			System.out.println("4.����");
			System.out.print("����:");
			select = sc.nextInt();
			
			if(select==1)
			{
				for(int i=0; i<name.length; i++)
				{
					for(int j=0; j<MAX; j++)	// name.length=MAX					
					{
						System.out.print(i+1+"��"+(j+1)+"�� �̸�:"); name[i][j] = sc.next();
						System.out.print(i+1+"��"+(j+1)+"�� ����:"); phone[i][j] = sc.next();
						System.out.print(i+1+"��"+(j+1)+"�� �ּ�:"); add[i][j] = sc.next();
					}
				}
			}
			else if(select==2)
			{
				for(int i=0; i<name.length; i++)
				{	
					for(int j=0; j<name.length; j++)
					{
						System.out.println
						(i+1+"��"+(j+1)+"��"+name[i][j]+"/"+phone[i][j]+"/"+add[i][j]);
					}
				}
			}	
			else if(select==3)
				{
					for(int i=0; i<name.length; i++)
						
					{
						for(int j=0; j<name.length; j++)
							{
								System.out.print("�˻��̸�:");
								String search = sc.next();
								if(search.equals(name[i][j]))
								{	
									System.out.println
									(i+1+"��"+(j+1)+"��"+name[i][j]+"/"+phone[i][j]+"/"+add[i][j]);
								}
			
							}
					}
				}
			else if(select==4)
				{System.out.print("���α׷�����"); break;}
		}
	}

}
