package inheritancedemo;

public class SeleniumInheritanceDemo {
	public static void main(String[] args) {
		// testcase = 
		//		1 - click on button
		//		2 - enter data as sachin
		// Runtime Polymorphism
		// parent class ref , and child class object
		//  parent class method visible, but execution happens for child class

		Browser browser = new ChromeBrowser();
		browser.click();
		//browser.enterData("");

	}
}
// ChromeBrowser - Optional 
// Mandatory - abstract class
// Abstract Method - No - Body 

// Abstract class - No Object (HAS-A Relation)
// Abstract class can inherit only
// Abstract class can have both type of method  - abstract / non-abstract(concrete)
// Interface - full abstarct - once class can implements multiple interfaces
// asbtract class - Partial abstraction

//abstract class Browser{
//public abstract void click();
//
//public void enterData(String text) {
//	
//}
//}

class H0{
	public void m1() {
		
	}
}

abstract class H1 extends H0{
	public abstract void m1();
}

abstract class H2 extends H1{
	public abstract void m1();
	public abstract void m2();
	
}

class H3 extends H2{
	public  void m1() {
		//super.m1();
	}
	public  void m2() {
		
	}
}
// static final int i = 10;
interface Browser{
	int i = 10; // Constant static and final
	public void click();
	public void enterData(String text);
}

interface TestBrowser extends Browser{
	public void click();
	public void enterData(String text);
	public void test1();
}

// Marker Interface - Serializable
interface marker {
	
}

class ChromeBrowser implements Browser,TestBrowser{
	public void click() {
		System.out.println(Browser.i);
	}
	public void enterData(String text) {
		System.out.println("chrome-enterdata "+text);
	}
	public void test1() {

	}
}

class FireFoxBrowser  implements Browser,TestBrowser{
	public void click() {
		System.out.println("firefox-click");
	}
	public void  enterData(String text) {
		System.out.println("firefox-enterdata "+text);
	}
	public void test1() {

	}
}

class EdgeBrowser  implements Browser{
	public void test1() {

	}
	public void click() {
		System.out.println("edge-click");
	}
	public void  enterData(String text) {
		System.out.println("edge-enterdata "+text);
	}
}