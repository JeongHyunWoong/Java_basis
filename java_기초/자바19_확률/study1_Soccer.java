package �ڹ�19_Ȯ��;

import java.util.Scanner;

public class study1_Soccer {

	public static void main(String[] args) {
		Soccer s = new Soccer();
	}
}

class Soccer{
	Scanner sc = new Scanner(System.in);
	
	String TeamName[] = {"��Ʈ��","���˸��帮��","�ٸ����γ�",""};
	String playMent[] = {"���� �����մϴ�.","���� 1���� �־����ϴ�.","���� ������ ������ �����߽��ϴ�.",
						"���� ���� �����ֳ׿�.","���� ���ݼ��� �ں����ϴ�.","���� ��Ű�۰� �����մϴ�.",
						"���� �г�Ƽ�� �����մϴ�.","���� �г�Ƽ�� �����մϴ�.","���� �ڻ���� �־����ϴ�.",
						"���� 1���� ������ ���߽��ϴ�."};
	int win=0;
	int draw=0;
	int loss=0;
	
	int awayWin[] = new int[3];
	int awayDraw[] = new int[3];
	int awayLoss[] = new int[3];
	
	int myWin,myDraw,myLoss;
	
	Soccer()
	{
		System.out.println("<�౸������ �����մϴ�!>\n");
		System.out.print("�������Է�:"); TeamName[3] = sc.next();
		System.out.println("������ �����մϴ�!\n");
		while(true)
		{
			System.out.println("1.�����ϱ�");
			System.out.println("2.��ŷ����");
			System.out.println("3.����");
			System.out.print("����:");
			int sel = sc.nextInt();
			if(sel==1) 
			{
				gameStart();
			}
			else if(sel==2) 
			{
				ranking();
			}
			else if(sel==3) 
			{
				System.out.println("���α׷�����"); break;
			}
		}		
	}
void gameStart() 
{
	int[] team = new int[4];
	for(int i=0; i<team.length; i++)
	{
		team[i] = (int)(Math.random()*4);
		
		for(int j=0; j<i; j++)
		{
			if(team[i]==team[j])
			{
				i--;
			}
		}
	}
	for(int i=0; i<team.length; i++)
	{
		System.out.println(i+1+"��:"+TeamName[team[i]]);
		System.out.println();
	}
	{
		System.out.println(TeamName[team[0]]+"VS"+TeamName[team[1]]);
	}
	while(true)
	{
		System.out.println("\n1.�౸����");
		System.out.println("2.���ư���");
		System.out.print("����:");
		int sel = sc.nextInt();
		int homeScore=0;
		int awayScore=0;
		if(sel==1)
		{
			for(int i=0; i<10; i++)
			{
				int rand = (int)(Math.random()*10);
				if(rand==0) 	 {ment(playMent[0]);}
				else if(rand==1) {ment(playMent[1]); homeScore++;}
				else if(rand==2) {ment(playMent[2]);}
				else if(rand==3) {ment(playMent[3]);}
				else if(rand==4) {ment(playMent[4]);}
				else if(rand==5) {ment(playMent[5]);}
				else if(rand==6) {ment(playMent[6]);}
				else if(rand==7) {ment(playMent[7]); homeScore++;}
				else if(rand==8) {ment(playMent[8]); awayScore++;}
				else if(rand==9) {ment(playMent[9]);}
				try { Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			System.out.println("<<�������ھ�>>");
			System.out.println
			("<"+TeamName[team[0]]+">"+homeScore+":"+awayScore+"<"+TeamName[team[1]]+">");
			
			if(homeScore>awayScore)       {win++;}
			else if(homeScore==awayScore) {draw++;}
			else if(homeScore<awayScore)  {loss++;}
			
			for(int i=0; i<3;i++)
			{
				int rand = (int)(Math.random()*3);
				if(rand==0)      {awayWin[i]++;}
				else if(rand==1) {awayDraw[i]++;}
				else if(rand==2) {awayLoss[i]++;}				
			}
		}
		else if(sel == 2) {break;}
	}
}

void ment(String ment) {System.out.println(ment);}
void ranking() 
	{
	   System.out.println("<<< ���� �� �� ��� >>>");
	   System.out.println("������ : "+TeamName[3]);
	   System.out.println("�¸�    ���º�    �й�");		    
	   System.out.println(" "+win+"     "+draw+"    "+loss);
	   
	   System.out.println("<<< �ٸ� �� ��� >>>");
		for(int i=0; i<3;i++)
		{			
			System.out.println("���� : "+TeamName[i]);		
			System.out.println("�¸�    ���º�    �й�");		    
			System.out.println(" "+awayWin[i]+"     "+awayDraw[i]+"    "+awayLoss[i]);
		}
	}
void save() {}
void load() {}
}



