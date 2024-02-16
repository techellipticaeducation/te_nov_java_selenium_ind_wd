package inheritancedemo;

public class ConstructionChainingDemo {
	public static void main(String[] args) {
		M3 t1 = new M3(10);
	}
}

class M1{
	M1(int i ){
		System.out.println("m1");
	}
}
class M2 extends M1{
	M2(int i){
		super(i);
		System.out.println("m2");
	}
}
class M3 extends M2{
	M3(int i){
		super(i);
		System.out.println("m3");	
	} 
	M3(){
		super(10);
	}
}

// NOOOOOOOOOOOOO 
// Reason - Super/this both call should be first call