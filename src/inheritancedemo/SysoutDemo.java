package inheritancedemo;

public class SysoutDemo {
	public static void main(String[] args) {
		
		while(true) {
		Human t1 = new Human("Vaibhav", 34);
		//System.out.println(t1);
		t1 = null;
		}
		
		// age object having ref mapped - then we cant delete it

//		String st1 = new String("Ruchita");
//		System.out.println(st1);

		// when jvm feels that memory not much 
		// garbage collection start
		// automatic
		//System.gc();
	}
}

class Human extends Object{

	String name;
	int age;

	Human(String name, int age){
		this.name = name;
		this.age  = age;
	}

	protected void finalize() throws Throwable {
		System.out.println("Hey guys. i am "+this.name+". i am garbage collected now");
	}

	public String toString() {
		System.out.println("Name : " +this.name);
		System.out.println("Age : " +this.age);
		return "====================";
	}
}
