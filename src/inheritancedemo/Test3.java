package inheritancedemo;

public class Test3 {
public static void main(String[] args) {
	Test6 t6 = new Test6();
//	t6.m1();
//	t6.m2();
	//t6.m3();
	// every class has a parent class - Object Class
	// public , protected, default , private 
	// private - visible - with in class
	
	// private method never inherit
	// Single Level Inheritance
	// Multi level Inheritance
	// Hierarchial Interitance
	// Multiple Inheritance not allowed in java - Ambiguity
	
}
}

class Test4{
	public void m3() {
		System.out.println("Test4.m3");
	}
}

class Test5 {
	public void m3() {
		System.out.println("Test5.m3");
	}
}

class Test6 extends Test4{
	public void m1() {
		m3();
	}
}
