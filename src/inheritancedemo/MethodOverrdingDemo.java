package inheritancedemo;

public class MethodOverrdingDemo {
	public static void main(String[] args) {

		RuralCitiBank fb = new RuralCitiBank();	
		System.out.println(fb.interestRate());
	}
}
// overriding - parent class - method ki functionality updates

class Bank{
	public double interestRate() {
		return 10.0d;
	}
	
	public final double homeloan() {
		return 10.0d;
	}
}

class ForeignBank extends Bank{
	public double interestRate() {
		return 20.0d;
	}
}

class CitiBank extends ForeignBank{
	public double interestRate() {
		return 30.0d;
	}
}

class RuralCitiBank extends CitiBank{

}
