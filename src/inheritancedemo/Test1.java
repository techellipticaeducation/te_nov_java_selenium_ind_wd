package inheritancedemo;

public class Test1 {
	public static void main(String[] args) {

	}
}

// final classes cannot inherit
class Test2{
	int i = 10;
	public void m1() {

	}
}

class Test33 extends Test2{
	public void m2() {
		System.out.println(i);
		m1();


		// IS A Relationship
		// Inheritance 



		//		Test2 t2 = new Test2();
		//		t2.m1();
		// HAS A Relationship
		// Test3 class has a Test2 class object


	}
}