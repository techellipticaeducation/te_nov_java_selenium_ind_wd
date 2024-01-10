package pac1;

public class CalculatorDemo {
	public static void main(String...args) {
		int sum = Calculator.add("d",10, 20);
		System.out.println(sum);
		int sum1 = Calculator.add("d",10, 20,45,34,23,2,3,45,2);
		System.out.println(sum1);
		int sum2 = Calculator.add("asd");
		System.out.println(sum2);
		int sum3 = Calculator.add("asdf",10,45,4,2,3,2);
		System.out.println(sum3);
		
//		varargs
//		var + args
//		various arguments
	}
}

// 2 rules
// in one paramters list we can have only 1 varargs
// varargs parameters must be your last param
// only and last param of param list

class Calculator{
	
	public static int add(String s,int...ruchita) {
		int sum = 0;
		for(int i = 0 ; i < ruchita.length ; i++) {
			sum = sum  + ruchita[i];
		}
		return sum;
	}
	
}