package oops;

public class ChatApplication {

	public static void main(String[] args) {

		Human h1 = new Human();
		h1.name = "Ruchita";
		h1.age= 25;
		h1.height = 150;
		
		Human h2 = new Human();
		h2.name = "Komal";
		h2.age = 26;
		h2.height = 160;
		
		Human h3 = new Human();
		h3.name = "Anshuli";
		h3.age = 27;
		h3.height = 170;
		
		h1.speak("Hello ! How are you.");
		h3.speak("Hey! I am good. How are you ? ");
		
		System.out.println(h1.age);
		h1.happyBirthDay();
		System.out.println(h1.age);
		
//		System.out.println(h3.name);
//		System.out.println(h3.age);
		
		// 1000 object of Human
		// how many name variables = 1000
		// how many age variables = 1000
		// how many country variable = 1000
		// static and instance variable
		
	}
}
