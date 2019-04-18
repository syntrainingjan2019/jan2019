package stringops;

public class stringbuilderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();		
		sb.append("Hello");		
		sb.append("Welcome to java world");
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		int cap =16+ (16+2)+(16+2)+(16+2);
		System.out.println(cap);
	}

}
