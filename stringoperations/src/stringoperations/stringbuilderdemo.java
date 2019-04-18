package stringoperations;

public class stringbuilderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language i like it"); 
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
