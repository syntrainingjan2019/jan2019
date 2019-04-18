package stringops;

public class stringbuilderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		//sb.append(" java");
		//sb.insert(4, "java");
//		sb.replace(1, 3, "java");
//		sb.delete(1, 3);
		// (16*2)+2
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("Welcome to java world");
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
	}

}
