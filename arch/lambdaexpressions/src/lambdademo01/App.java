package lambdademo01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s1=(name)->{
			return "Hello "+name;
		};
		System.out.println(s1.say("Jack"));
		Speak s2=(name)->{
			return "Welcome "+name;
		};
		System.out.println(s2.say("John"));
	}

}
