package inherit;

public class rectangle extends Shape{
	int length,breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public rectangle(int length, int breadth) {		
		this.length = length;
		this.breadth = breadth;
	}
	public rectangle(){
		super();
		this.length=30;
		this.breadth=20;
	}
	public void draw(){
		System.out.println("my name is :"+name);
		System.out.println("drawing rectangle of length "+length+" breadth:"+breadth);
		
	}
}
