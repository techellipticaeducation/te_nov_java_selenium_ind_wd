package oops;

public class Test45 {
	int i = 10;
	static int j = 20;

	public void m1() {
		int i = 30;
		int j = 50;

		System.out.println(i);
		System.out.println(j);
		System.out.println(Test45.j);
		System.out.println(this.i);
		this.m2();
	}
	public void m2() {
		
	}
	public static void main(String[] args) {
		Test45 test1 = new Test45();
		test1.m1();
	}
}
