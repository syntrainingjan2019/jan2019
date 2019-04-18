package com.mypkg;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius =10;
		Drawable dw=()->{
			System.out.println("drawing a circle wit radius :"+radius);
		};
		dw.draw();
	}

}
