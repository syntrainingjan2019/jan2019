package stringops;

import java.util.StringTokenizer;

public class StringTokenizerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("my name is bob","a");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
	}

}
