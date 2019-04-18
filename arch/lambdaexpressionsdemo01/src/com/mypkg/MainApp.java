package com.mypkg;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sayable sa=()->{
//			return "this is a test function";
//		};
//		System.out.println(sa.say());
		int radius=10;
		Drawable dw=()->{
			System.out.println("drawing a circle with radius "+radius);
		};
		dw.draw();
		Addable add1=(a,b)->(a+b);
		System.out.println(add1.add(34, 56));
		Addable add2=(a,b)->{
			return a+b;
		};
		System.out.println(add2.add(34, 56));
	}

	
}
