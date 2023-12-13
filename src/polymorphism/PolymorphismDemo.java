package polymorphism;

public class PolymorphismDemo {
	public static void main(String[] args) {
		//	polymorphism
		//	
		
		float j = Calculator.sum(10,30);
		System.out.println(j);
		// size of int = 4 byte
		// float 4 byte

		// size of double = 8 byte
	}
}

// Method Overloading - Compile Time Polymorphism

class Calculator{
	static float sum(float i, float j) {
		System.out.println("m1");
		float k = i+j;
		return k;
	}
	
	static float sum(int i, float j) {
		System.out.println("m2");
		float k = i+j;
		return k;
	}
	static float sum(float i, int j) {
		System.out.println("m3");
		float k = i+j;
		return k;
	}
	static float sum(int i, int j) {
		System.out.println("m4");
		float k = i+j;
		return k;
	}
	
	// either type of param are differnt
		// number of param
		
		// method overloading never depend on return type
		
		// method ambiguity
	
}