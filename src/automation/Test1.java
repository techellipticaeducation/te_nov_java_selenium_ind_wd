package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		// protocol is mandatory
		
	}
}
