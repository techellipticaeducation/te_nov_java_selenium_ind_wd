package oops;

public class Human {

	// characteristic
	String name;
	int age;
	int height;
	String country;
	
	
	// Behaviour
	void speak(String content) {
		System.out.println(name + " - " + content);
	}
	
	void happyBirthDay() {
		age++;
		System.out.println("Happy Birthday ! " + name);
	}
	
}
