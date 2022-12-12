package ÀÚ¹Ù20_Layout;

import java.awt.*;

public class MyAWTFrame3 { //FlowLayout
	private Frame fr;
	
	public MyAWTFrame3(String str) {
		initialize(str);
	}

	public static void main(String[] args) {
		MyAWTFrame3 myfr = new MyAWTFrame3("MyAWTFrameTitle");
		myfr.fr.setVisible(true);
	}
	private void initialize(String str) {
		fr = new Frame(str);
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		Button bt5 = new Button("Center");
		
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		
		fr.setSize(200,200);
	}
}
