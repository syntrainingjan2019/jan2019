package anynomousclass;

public class MainApp {
	public void displayMessage(Message m){
		System.out.println(m.greet());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainApp obj=new MainApp();
		obj.displayMessage(new Message(){
			public String greet(){
				return "Helo Anonymous class";
			}
		});
	}

}
