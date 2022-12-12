package 자바19_확률;

import java.util.Scanner;

public class study1_Soccer {

	public static void main(String[] args) {
		Soccer s = new Soccer();
	}
}

class Soccer{
	Scanner sc = new Scanner(System.in);
	
	String TeamName[] = {"토트넘","레알마드리드","바르셀로나",""};
	String playMent[] = {"팀이 공격합니다.","팀이 1골을 넣었습니다.","팀이 슈팅을 했지만 실패했습니다.",
						"팀의 수비가 끝내주네요.","팀의 공격수가 자빠집니다.","팀의 골키퍼가 선방합니다.",
						"팀이 패널티에 실패합니다.","팀이 패널티를 성공합니다.","팀이 자살골을 넣었습니다.",
						"팀의 1명이 퇴장을 당했습니다."};
	int win=0;
	int draw=0;
	int loss=0;
	
	int awayWin[] = new int[3];
	int awayDraw[] = new int[3];
	int awayLoss[] = new int[3];
	
	int myWin,myDraw,myLoss;
	
	Soccer()
	{
		System.out.println("<축구게임을 시작합니다!>\n");
		System.out.print("내팀명입력:"); TeamName[3] = sc.next();
		System.out.println("게임을 시작합니다!\n");
		while(true)
		{
			System.out.println("1.게임하기");
			System.out.println("2.랭킹보기");
			System.out.println("3.종료");
			System.out.print("선택:");
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
				System.out.println("프로그램종료"); break;
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
		System.out.println(i+1+"팀:"+TeamName[team[i]]);
		System.out.println();
	}
	{
		System.out.println(TeamName[team[0]]+"VS"+TeamName[team[1]]);
	}
	while(true)
	{
		System.out.println("\n1.축구시작");
		System.out.println("2.돌아가기");
		System.out.print("선택:");
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
			System.out.println("<<최종스코어>>");
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
	   System.out.println("<<< 현재 내 팀 기록 >>>");
	   System.out.println("내팀명 : "+TeamName[3]);
	   System.out.println("승리    무승부    패배");		    
	   System.out.println(" "+win+"     "+draw+"    "+loss);
	   
	   System.out.println("<<< 다른 팀 기록 >>>");
		for(int i=0; i<3;i++)
		{			
			System.out.println("팀명 : "+TeamName[i]);		
			System.out.println("승리    무승부    패배");		    
			System.out.println(" "+awayWin[i]+"     "+awayDraw[i]+"    "+awayLoss[i]);
		}
	}
void save() {}
void load() {}
}



