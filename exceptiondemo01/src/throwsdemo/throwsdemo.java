package throwsdemo;

import java.io.IOException;

public class throwsdemo {
	
	void m() throws IOException{
		throw new IOException("device error");
	}
	void n() throws Exception
	{
		m();
	}
	void p(){
		try{
			n();
		}
		catch(Exception e){
			System.out.println("exception handled "+ e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwsdemo obj=new throwsdemo();
		obj.p();
		System.out.println("normal flow");
	}

}
