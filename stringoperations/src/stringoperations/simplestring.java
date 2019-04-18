package stringoperations;

public class simplestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java";
		String subname="JAVA";
		String coursename=new String("java");
		System.out.println(name+" "+subname+" "+coursename);
		if(name.equalsIgnoreCase(subname)){
			System.out.println("string are equal");
		}
		else{
			System.out.println("strings are not equal");
		}
	}

}
