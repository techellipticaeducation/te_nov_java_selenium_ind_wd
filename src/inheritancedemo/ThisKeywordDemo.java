package inheritancedemo;

public class ThisKeywordDemo {
	public static void main(String[] args) {
		TechEllipticaString t1 = new  TechEllipticaString("Test1");
		t1.uppercase().lowercase().removeAllOne();		
		System.out.println(t1.str);
		
		String s1 = new String("Test1");
		String s2 = s1.toUpperCase().toLowerCase().trim();
		System.out.println(s2);
	}	
}

class TechEllipticaString{
	// Selenium Actions Classes
	String str;   
	TechEllipticaString(String str){
		this.str = str;
	}
	public TechEllipticaString uppercase() {
		this.str = this.str.toUpperCase();
		return this;
	}	
	public TechEllipticaString removeAllOne() {
		this.str = this.str.replace("1", "");
		return this;
	}
	public TechEllipticaString lowercase() {
		this.str = this.str.toLowerCase();
		return this;
	}
	
	
}
