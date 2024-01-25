package automation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String args[]) {
		String driverPath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		// Session
		
		// ChromeDriver
		ChromeDriver driver = new ChromeDriver();  // browser open
		driver.manage().window().maximize(); // maximize
//		Dimension mobileDim = new Dimension(200, 600);
//		driver.manage().window().setSize(mobileDim);
		
//		Point point = new Point(300, 100);
//		driver.manage().window().setPosition(point);
		driver.get("https://www.google.com");
		
		// protocol is mandatory
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
//		driver.close();  // active tab ko close (only active tab)
//		driver.quit();  //entire session close (1 tab)
		
	}
}
