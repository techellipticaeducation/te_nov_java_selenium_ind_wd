package inheritancedemo;

public class SuperKeywordDemo {
	public static void main(String[] args) {
		Test91 t1 = new Test91();
		t1.m3();
	}
}
class Test89{
	int i = 10;
	public void m1() {
		System.out.println("m1 of Test89");
	}
}

class Test90 extends Test89{
	int i = 10;
	public void m1() {
		System.out.println("m1 of Test90");
	}
	public void m3() {
		super.m1();
	}
}

class Test91 extends Test90{
	int i = 20;
	public void m1() {
		System.out.println("m1 of Test91");
	}
	
	public void m2() {
		System.out.println(i);
		System.out.println(super.i);
	}
}
