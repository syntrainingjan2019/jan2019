package lambdademo01;

public class MultipleStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s=(message)->{
			 String str1="i want to say hello to ";
			 String str2=str1+message;
			 return str2;
		};
		System.out.println(s.say("Nancy"));
	}

}
