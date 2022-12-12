package 자바09_class;

import java.util.Scanner;

public class Study1_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fan f = new Fan();
		int select;
		System.out.println("[선풍기 상태정보]");
		System.out.println("선풍기명:"+f.name);
		System.out.println("전원:"+f.power+"/회전:"+f.rotate);
		System.out.println("속도:"+f.speed+"/높이:"+f.headControl);
		System.out.println("1.전원켜기");
		System.out.println("2.종료");
		System.out.println("선택:");
		select = sc.nextInt();
		if(select==1)
			{System.out.println("선풍기 전원이 들어왔습니다.");
			 f.power = true;}
		while(f.power)
		{	
			System.out.println("[선풍기 상태정보]");
			System.out.println("선풍기명:"+f.name);
			System.out.println("전원:"+f.power+"/회전:"+f.rotate);
			System.out.println("속도:"+f.speed+"/높이:"+f.headControl);
			System.out.println("1.회전설정");
			System.out.println("2.속도조정");
			System.out.println("3.높이조정");
			System.out.println("4.종료");
			System.out.println("선택:");
			select = sc.nextInt();
			if(select==1)
			{
				System.out.println("현재전원이 꺼져있습니다.");
				System.out.println("선풍기를 회전하시겠습니까?(y,n):");
				String ok = sc.next();
				if(ok.equals("y"))
				{
					System.out.println("선풍기 회전이 시작합니다.");
					f.rotate = true;
				}
				else
				{
					System.out.println("잘못입력해서 회전 미동작");
				}
			}
			else if(select==2)
			{
				System.out.println("현재속도가 꺼짐입니다.");
				System.out.println("풍속설정(1.약풍,2.중풍,3.강풍):");
				int ok = sc.nextInt();
				if(ok==0)
				{
					System.out.println("안돌아갑니다.");
					f.speed = 0;
				}
				else if(ok==1)
				{	
					System.out.println("약풍으로 동작합니다.");
					f.speed = 1;
				}
				else if(ok==2)
				{
					System.out.println("중풍으로 동작합니다.");
					f.speed = 2;
				}
				else if(ok==3)
				{
					System.out.println("강풍으로 동작합니다.");
					f.speed = 3;
				}
			}
			else if(select==3)
			{
				System.out.println("현재아래 고정입니다.");
				System.out.println("헤드를 올리시겠습니까?(y,n):");
				String ok = sc.next();
				if(ok.equals("y"))
				{
					System.out.println("선풍기 헤드가 위로 올라갑니다.");
					f.headControl = true;
				}
				else if(ok.equals("n"))
				{
					System.out.println("선풍기 헤드가 고정됩니다.");
					f.headControl = true;
				}
			}
			else if(select==4)
			{
				System.out.print("프로그램종료"); break;}
			}
			
	}
}
class Fan{
	boolean power = false; //전원
	boolean rotate = false; //회전
	int speed = 0; //0꺼짐 1:약풍 2:중풍 3:강풍
	boolean headControl = false; //위아래
	String name="토네이도선풍기";
	
	void power() { System.out.println("전원이켜졌습니다.");}
	void rotate() { System.out.println("회전모드입니다.");}
	void speed() { System.out.println("현재 약풍입니다.");}
	void headControl() { System.out.println("높이조절변경");}
	void name() { System.out.println("이름이 변경되었습니다.");}
}
