package com.mypkg;

public interface FuncInterface {
	void abstractFun(int x,int y);
	default void normalfun(){
		System.out.println("Hello");
	}
}
