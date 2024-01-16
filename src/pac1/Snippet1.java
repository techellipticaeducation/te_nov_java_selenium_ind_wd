package pac1;

public class Snippet1 {

	static int i= 10;
	
	static {
		System.out.println("block1 -> "+i);
	}

	static int j = 20;
	static {
		System.out.println("block2 -> "+j);
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
	static {
		System.out.println("block3 -> "+i);
	}
}

/*
 * 
 * variable || non -name static block 
 * static method
 * 
 *  
 * 
 * block1 -> 10
 * block2 -> 10
 * block3 -> 10
 * main
 * 
 * */
