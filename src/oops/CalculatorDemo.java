package oops;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		
		// 7 table
		// Arguments
		
		for(int i = 1; i <= 10 ;i++) {
			int m1 = calc1.multiply(7,i);
			System.out.println("7 * " + i + " = " +m1);
		}
		
		
		System.out.println(calc1.valueOfPi());
		
	}
}
