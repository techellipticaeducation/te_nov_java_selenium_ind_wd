package oops;

public class Human {

	// characteristic
	// instance variable
	String name;
	int age;
	int height;
	
	// static variable - class variables
	static String country;
	
	
	// Behaviour
	void speak(String content) {
		int i = 10; // Local variable (inside method)
		System.out.println(name + " - " + content);
	}
	
	void happyBirthDay() {
		age++;
		System.out.println("Happy Birthday ! " + name);
	}
	
}
