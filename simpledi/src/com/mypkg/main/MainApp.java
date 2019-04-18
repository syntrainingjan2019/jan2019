package com.mypkg.main;

import com.mypkg.models.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Shape s=new Shape();
		s.draw(c);
		s.draw(r);
	}

}
