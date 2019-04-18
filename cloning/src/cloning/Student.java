package cloning;

public final class Student implements Cloneable,Comparable<Student>{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(this.id==st.id)
			return 0;
			else if(this.id>st.id)
				return 1;
			else
				return -1;
	}
	@Override
	public boolean equals(Object o){
		Student st=(Student)o;
		
		if(this.id==st.id){
			return true;
		}
		else {
			return false;
		}
	}
}
