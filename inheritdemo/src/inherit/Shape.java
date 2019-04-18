package inherit;

public class Shape {
	String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
		this.name="i have no name yet";
	}
	public void draw(){}
}
