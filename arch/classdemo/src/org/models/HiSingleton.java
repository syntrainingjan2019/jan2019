package org.models;

public class HiSingleton	{
	static HiSingleton instance =null;
	public int x=10;
	private HiSingleton(){}
	public static HiSingleton getInstance(){
		if(instance==null){
			instance=new HiSingleton();
		
		}
		return instance;
	}
}
