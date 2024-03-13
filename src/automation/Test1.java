package automation;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	public static void main(String args[])throws Exception {
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
//		driver.get("https://techelliptica.com/game/xpath.html");
//		
//		driver.findElement(By.xpath("//button[text()='clickStock1']")).click();
//		
//		Actions action = new Actions(driver);
//		action.click().clickAndHold(null).doubleClick().
//		contextClick().build().perform();
		
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
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		takeScreeshot(driver, "before");
		// How to select Drop down
		WebElement sortDropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s1 = new Select(sortDropdown);
		s1.selectByValue("lohi");
		takeScreeshot(driver, "after");
		
		// How to take screenshot
		// Apache Commons
		
		
		
	}
	
	public static void takeScreeshot(WebDriver driver, String screenshotName) throws IOException{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, 
				new File(System.getProperty("user.dir")+"\\screenshots\\"+screenshotName+".png"));
	}
	
}
