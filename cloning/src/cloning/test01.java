package cloning;

public class test01 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setAge(12);
		s1.setId(101);
		s1.setName("stu01");
		Student s2=(Student)s1.clone();
//		Student s2=new Student();
		s2.setAge(12);
		s2.setId(101);
		s2.setName("stu01");
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2)){
			System.out.println("objects are equal");
		}
		else{
			System.out.println("objects are not equal");
		}
	}

}
