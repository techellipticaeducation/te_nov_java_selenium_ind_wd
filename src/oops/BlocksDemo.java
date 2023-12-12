package oops;

public class BlocksDemo {
	
	// Can we execute our code with executing main method? 
	
	static {
		System.out.println("Hello");
		System.exit(5);  // JVM Kill
	}
	public static void main(String[] args) {
		//BlockJava.test1();
		BlockJava b1 = new BlockJava();
		BlockJava b2 = new BlockJava();
		BlockJava b3 = new BlockJava();
		BlockJava b4 = new BlockJava();
	}
}

// static entities      ( variable , blocks ) -> methods
// instance entities     variable , blocks , methods

// j , static block , test1
// i , instance block , test2   (object create)
// static method do not allow instance variables directly
// instance method allow instance and static variables
class BlockJava{
	
	int i = j;  // instance variable
	static int j = 20; // static variabale
	
	static{
		System.out.println("m1");
	}
	
	{
		System.out.println("m2");	
	}
	
	static void test1(){
		//test2();
		System.out.println(j);
	}
	
	void test2() {
		test1();
		System.out.println(i);
		System.out.println(j);
	}
	
	
}