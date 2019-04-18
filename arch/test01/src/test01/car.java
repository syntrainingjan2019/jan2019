package test01;

public class car {
	private String name;
	public car(){
		name="jaguar";
	}
	public car(String cname){
		name=cname;
	}
	public String getName() {
		return name;
	}
	public void dispName(){
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
