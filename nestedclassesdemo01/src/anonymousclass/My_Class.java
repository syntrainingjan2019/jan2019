package anonymousclass;

public class My_Class {
	public void displayMessage(Message m){
		System.out.println(m.greet());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Class obj=new My_Class();
		obj.displayMessage(new Message(){
			public String greet(){
				return "Hello anonymous class";
			}
		});
	}

}
