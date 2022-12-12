package 자바02_제어문시작;

import java.util.Scanner;

public class switch14 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String grade;
		System.out.println("학점을 입력하세요"); grade = sc.next();
		
		switch(grade)
		{
		case "A" : System.out.println("90점~100점입니다."); break;
		case "B" : System.out.println("80점~90점미만입니다."); break;
		case "C" : System.out.println("70점~80점미만입니다."); break;
		case "F" : System.out.println("70점미만입니다."); break;
		}
		String name;
		System.out.println("이름을 입력하세요"); name = sc.next();
		
		switch(name)
		{
		case "홍길동" : System.out.println("동에번쩍서에번쩍 옛날사람!"); break;
		case "에스파" : System.out.println("와우~! 요새 이쁜 아이돌!"); break;
		case "이병헌" : System.out.println("로맨틱 성공적! 이걸 연기로! 격파!"); break;
		case "마동석" : System.out.println("행님 존경합니다!"); break;
	}}}
