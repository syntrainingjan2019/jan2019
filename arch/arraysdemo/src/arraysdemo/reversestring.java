package arraysdemo;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is a new language";
		System.out.println(str.length());
		char ch[]=str.toCharArray();
		char rev[]=new char[str.length()];
		for(int i=ch.length-1;i>=0;i--){
			rev[i]=ch[ch.length-i-1];
		}
		for(int i=0;i<str.length();i++){
			System.out.print(rev[i]);
		}
		
	}

}
