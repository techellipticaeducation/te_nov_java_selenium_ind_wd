package oops;

public class StringMethodDemo {
	public static void main(String[] args) {

		String st1 = "this is java session";
		System.out.println(st1.length());	
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		
		System.out.println(st1.charAt(5));
		System.out.println(st1.indexOf('i',st1.indexOf('i')+1));
		
		System.out.println(st1.replace(" ", "").length());
		//thisisjavasession
	
		String[] parts = st1.split(" ");
		for(String part : parts) {
			System.out.println(part);
		}
		
		System.out.println(st1.substring(5));
		System.out.println(st1.replace("java", "python"));
		
		// Conversion
		int i = 10;
		int j = 20;
		String k = String.valueOf(i)+String.valueOf(j);
		System.out.println(k);
		
		// you have to convert data-type into string
//		int -> string
		
		// string into datatype
		String m1 = "10";
		String m2 = "20";
		
		// Wrapper class
		// byte  - Byte
		// short - Short
		// int - Integer
		// long - Long
		// float - Float
		// double - Double
		// boolean - Boolean 
		// char - Character
		int l1 = 10;
		// Autoboxing/Unboxing - datatype -> wrapper
		
		Integer m10 = l1;
		int j1 = m10;
		
		int k1 = Integer.parseInt(m1)+Integer.parseInt(m2);
		System.out.println(k1);
		
		
	}
}
