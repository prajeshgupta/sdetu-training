package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking!!");
	}
	
	void email(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping!!");
	}
}


public class Demo {
	
	public static void main(String[] args) {
		//initializing a new object
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7925958438";
		
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testemail.com";
		person2.sleep();
		person2.email();
	}
}
