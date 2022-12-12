package 자바12_상속;

public class 상속1 {

	public static void main(String[] args) {
		AAA a = new AAA();
	}
}
class AAA extends BBB{
	String myname = "홍길동";
	int money = 10000;
	AAA(){
		System.out.println("AAA클래스가 생성되었습니다.");
		System.out.println("AAA클래스의 돈:"+money);	
		System.out.println("AAA클래스의 돈:"+super.money);
		System.out.println("내이름:"+myname);
		System.out.println("부모님이름:"+name);
	}
}
class BBB{
	String name = "부모님";
	int money = 1000000000;
	BBB(){
		System.out.println("BBB클래스가 생성되었습니다.");
		System.out.println("BBB클래스의 돈:"+money);
	}
}
