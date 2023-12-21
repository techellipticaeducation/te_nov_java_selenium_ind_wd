package oops;

public class CallByValueDemo {
	public static void main(String[] args) {
		
//		int i = 10;
//		System.out.println(i); // 10
//		
//		Test345 t1 = new Test345();
//		t1.test1(i);
//		
//		System.out.println(i); // 
		
		
		// when ever we are sending data type, int, float, byte, long, boolean
		// never actual variable . copy
//		Call By Value - copy of variable
		
		
		Test350 obj1 = new Test350();
		System.out.println(obj1.i); // 10
		
		Test345 t1 = new Test345();
		t1.test2(obj1);
		
		System.out.println(obj1.i); // 10
		
		// Call by Ref - object
	}
}


class Test345{

	void test1(int i) {
		i = 20;
	}
	
	void test2(Test350 test) {
		test.i = 40;
	}

}

class Test350{
	int i = 10;
}
