package nested;

public class Anonymousclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person(){
			void eat(){
				System.out.println("i am eating ice  cream");
			
			}
		};
		person.eat();
	}

}
