package datatype;

public class OperatorDemo {
	public static void main(String[] args) {
		// Arithmatic Operators
		// + 
		// -
		// *
		// / 
		// %
		
		int i = 10;
		int j = 7;
		
		System.out.println(i+j); // 17
		System.out.println(i-j); // 3 
		System.out.println(i*j); // 70
		System.out.println((float)i/(float)j); // 1.45
		System.out.println(i%j); // 3
		
		// Swap the values
		int m1 = 10;
		int m2 = 7;		
//		int m3 = m1;
//		m1 = m2;
//		m2 = m3;

//		System.out.println("m1 -> " + m1);
//		System.out.println("m2 -> " + m2);
		// m1 = 7, m2 = 10
		
		
		// without using third variable?
		// how to debug your code
		m1 = m1 * m2;    // m1 = 70, m2 = 7
		m2 = m1 / m2;    // m1 = 70, m2 = 10
		m1 = m1 / m2;    // m1 = 7 , m2 = 10;
		
		System.out.println("m1 -> " + m1);
		System.out.println("m2 -> " + m2);
		
	}
}
