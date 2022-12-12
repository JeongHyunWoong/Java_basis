package 자바15_클래스_랜덤및스레드;

import java.util.Scanner;

public class study3 {

	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.start();
	}
}
class Dice extends Thread{	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		int my;
    	System.out.print("내 숫자 정하기(1~6):");
    	my = sc.nextInt();
    	System.out.print("시작!!");
    	int count=1;
		while(true) 
		{
			int dice = (int)(Math.random()*6+1);
			try {
	    		Thread.sleep(1000);
	    	}catch(InterruptedException ie) {}
	    if(my == dice)
	    	{ 	
	    	System.out.println("운좋노~");
	    	System.out.println(count+"회시도!!컴퓨터수:"+dice); break;
	    	}
	    else
	    	{
	    	try {
	    		Thread.sleep(1000);
	    		System.out.println("ㅄ~");
	    	}catch(InterruptedException ie) {}
	    		System.out.println("내가정한수:"+my+"/컴퓨터수:"+dice);
	    	} 
	    	count++;
		}
	}
}



