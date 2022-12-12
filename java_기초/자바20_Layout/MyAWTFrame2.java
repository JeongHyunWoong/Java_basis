package ÀÚ¹Ù20_Layout;

import java.awt.*;

public class MyAWTFrame2 {
	private Frame fr;
	
	public MyAWTFrame2(String str) { //BorderLayout
		initialize(str);
	}

	public static void main(String[] args) {
		MyAWTFrame2 myfr = new MyAWTFrame2("MyAWTFrameTitle");
		myfr.fr.setVisible(true);
	}
	private void initialize(String str) {
		fr = new Frame(str);
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		Panel pn = new Panel();
		Checkbox ck1 = new Checkbox("First");
		Checkbox ck2 = new Checkbox("Second");
		Checkbox ck3 = new Checkbox("Third");
		
		fr.setLayout(new BorderLayout(0,0));
		fr.add(bt1, BorderLayout.NORTH);
		fr.add(bt2, BorderLayout.SOUTH);
		fr.add(bt3, BorderLayout.EAST);
		fr.add(bt4, BorderLayout.WEST);
		
		pn.add(ck1);
		pn.add(ck2);
		pn.add(ck3);
		fr.add(pn,BorderLayout.CENTER);
		
		fr.setSize(200,200);
	}
}
