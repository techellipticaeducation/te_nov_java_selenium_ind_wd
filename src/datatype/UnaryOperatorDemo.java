package datatype;

public class UnaryOperatorDemo {
public static void main(String[] args) {
	// operator which need only one operand - Unary Operator
	// +, -, ++,--,!
	
	boolean b1 = true;
	System.out.println(!b1);
	
	
	// increment , 
	// pre  ++i , first increase, then assign
	// post i++ , first assign then increase
	
	int i = 10;
	int j  =   i++ + ++i + i++ + --i + i-- + i++;
	
	
	System.out.println("i -> " + i); //12
	System.out.println("j -> " + j); //
	
	
}
}
