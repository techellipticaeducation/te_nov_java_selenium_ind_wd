package oops;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(Test4.j);

		Test4 t1 = new Test4();
		System.out.println(t1.i);
	}
}


class Test4{
	int i ; // instance variable
	static int j; //
}