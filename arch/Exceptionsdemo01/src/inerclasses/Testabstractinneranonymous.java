package inerclasses;

public class Testabstractinneranonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(){
			void eat(){
				System.out.println("i am eating fruits");
			}
		};
		p.eat();
	}

}
