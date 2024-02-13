package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		driver.get("https://techelliptica.com/game/xpath.html");
		
		driver.findElement(By.xpath("//button[text()='clickStock1']")).click();
		
		
		Actions action = new Actions(driver);
		action.click().clickAndHold(null).doubleClick().
		contextClick().build().perform();
		
		// protocol is mandatory
		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String currentURL = driver.getCurrentUrl();
//		System.out.println(currentURL);
//		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		
		
		//Action 
		// Text box value
		// link , button click
		
		// Locators
		// id
		// name
		// classname
		// tagname
		// linktext
		// partial linktext
		// xpath
		// css selector
		
		
		// abcd
		// abc - linktext -> exact
		// abc - partiallinktext -> exact
		
//		name="q"
		
	
//		
//		driver.findElement(By.name("q")).sendKeys("sachin tendulkar",Keys.ENTER);
//		
//		
//		
//		By l1 = By.xpath("//h3[text()='Sachin Tendulkar']/parent::a");
//		WebElement link = driver.findElement(l1);
//		link.click();
		
		//  String type class
		
		
//		driver.close();  // active tab ko close (only active tab)
//		driver.quit();  //entire session close (1 tab)
		
	}
}
