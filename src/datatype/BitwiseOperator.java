package datatype;

public class BitwiseOperator {
public static void main(String[] args) {
	// class never starts with number
	// special char expect $_
	//  1Test -    invalid
	//  Test1 -    valid
	//  $Test -    valid
	//  #Test -    invalid
	//  _Test -    valid
	//  Test# -    invalid

	
	// when we have multiple condition to check 
	//  then we use & , |
	
	// And 
	// true & true = true
	// true & false = false
	// false & true = false
	// false & false = false
	
	
	// OR (any one is true then true)
	// true | true = true
	// true | false = true
	// false | true = true
	// false | false = false
	
	
	// Logical Operator
	
	System.out.println(TRUE() || FALSE());
	
}

public static boolean TRUE() {
	System.out.println("A");
	return true;
}

public static boolean FALSE() {
	System.out.println("B");
	return false;
}



}
