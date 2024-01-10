package oops;

public class ConstructorDemo {
	public static void main(String[] args) {
		Test346 t1  = new Test346(10,50);	
	}
}

class Test346{
	int i = 10;
	static int j = 20;
	
	Test346(){
		this(10,20);
	}
	
	Test346(int i, int j){
		//this();
		this.i = i;
		
		Test346.j = j;
		System.out.println("Hello");
	}
	
	void test1() {
		System.out.println("Hello i am non - static method");
	}
	
	static void test2() {
		System.out.println("Hello i am static method");
	}
}

//Rule Book
// 1 - constructor name will be same as class name
// 2 - constructor never provide any return type

// 2 credits
// default constructor