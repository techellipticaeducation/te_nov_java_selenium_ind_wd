package pac1;

public class ConnectionDemo {
	public static void main(String[] args) {
		Connection.hello();
		for(int i = 1 ;i <= 10 ;i++) {
			Connection conn1 = Connection.objectCreationMethod();
			System.out.println(conn1);
			conn1.m1();
		}
		System.out.println("Total Object Created " + Connection.i);		
	}
}
// I only want to create object once
// Singleton Design Pattern

// step 1 - constructor private
// step 2 - create static variable as classname
// step 3  -create statci method with class object return type 
// step 4 - if condition , if conn ref is null then create object 

class Connection{
	
	static int i = 0;
	static Connection conn1 = null;
	private Connection(){
		
	}
	
	public static Connection objectCreationMethod() {
		if(conn1 == null) {
		 conn1 =  new Connection();
		 i++;
		}
		return conn1;
	}
	
	public static void hello() {
		
	}
	
	public void m1() {
		System.out.println("Imp Logic");
	}
	
}
