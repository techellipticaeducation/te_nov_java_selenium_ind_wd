package oops;

public class StringDemo {
	public static void main(String[] args) {
		
		// Array of character
		
		String s1 = "Java"; 
		String s2 = "Java"; 
		String s3 = new String("Java");  
		String s4 = new String("Java");  
 			
		s3 = s3.intern();
		System.out.println(s1== s2); // true
		System.out.println(s2== s3); // false
		System.out.println(s3== s4); // false
		
		// == operator with strings
		// equals 
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s2.equals(s3)); // false
//		System.out.println(s3.equals(s4)); // false
		
	
	}
}
