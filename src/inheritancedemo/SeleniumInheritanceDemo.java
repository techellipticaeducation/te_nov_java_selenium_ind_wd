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

class Browser{
	public void click() {
		System.out.println("browser click");
	}
	
	public void enterData(String text) {
		
	}
}

class ChromeBrowser extends Browser{
	public void click() {
		System.out.println("chrome click");
	}
	public void enterData(String text) {
		System.out.println("chrome-enterdata "+text);
	}
}

class FireFoxBrowser  extends Browser{
	public void click() {
		System.out.println("firefox-click");
	}
	public void  enterData(String text) {
		System.out.println("firefox-enterdata "+text);
	}
}

class EdgeBrowser  extends Browser{
	public void click() {
		System.out.println("edge-click");
	}
	public void  enterData(String text) {
		System.out.println("edge-enterdata "+text);
	}
}