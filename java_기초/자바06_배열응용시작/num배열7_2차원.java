package 자바06_배열응용시작;

public class num배열7_2차원 {

	public static void main(String[] args) {
		
		String name[][] = new String[2][2]; //예시.
		String name2[][] =
			{
					{"홍길동1", "둘리1", "아무개1"},
					{"홍길동2", "둘리2", "아무개2"},
					{"홍길동3", "둘리3", "아무개3"},
			};
		System.out.println("name2[0][0]:"+name2[0][0]);
		System.out.println("name2[1][1]:"+name2[1][1]);
		System.out.println("name2[2][0]:"+name2[2][0]);
		
	}

}
