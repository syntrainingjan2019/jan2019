package org.main;

import org.models.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am main function");
		MainApp.main("one");
		MainApp.main("one","two");
	}
	public static void main (String arg1){
		System.out.println("i am having only one argument");
	}
	public static void main (String arg1,String arg2){
		System.out.println("i have only two arguments arg1"+arg1+" arg2 :"+arg2);
	}
}
