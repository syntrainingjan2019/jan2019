package multipleinheritance;

public class MainApp implements Parent1,Parent2{
	public void show(){
		System.out.println("this is the child class");
		Parent1.super.show();
		Parent2.super.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainApp m=new MainApp();
		m.show();
	}

}
