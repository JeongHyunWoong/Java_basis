package 자바15_클래스_랜덤및스레드;

import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {
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
	    	System.out.println(count+"회시도!!내가정한수:"+dice); break;
	    	}
	    else
	    	{
	    	System.out.println("ㅄ~");
         	System.out.println(count+"회시도!!컴퓨터수:"+dice);
	    	} 
	    	count++;
		}
	}
}



