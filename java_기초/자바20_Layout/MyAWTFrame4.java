package ÀÚ¹Ù20_Layout;

import java.awt.*;

public class MyAWTFrame4 { //GridLayout
	private Frame fr;
	
	public MyAWTFrame4(String str) {
		initialize(str);
	}

	public static void main(String[] args) {
		MyAWTFrame4 myfr = new MyAWTFrame4("MyAWTFrameTitle");
		myfr.fr.setVisible(true);
	}
	private void initialize(String str) {
		fr = new Frame(str);
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		
		fr.setLayout(new GridLayout(2,2));
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		bt1.setSize(100,100);
		
		fr.setSize(200,200);
	}
}
