package week5.day1.testclasses;




import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver;
	String baseUrl;



		
		@Test
		  public void testLocators() throws InterruptedException {
			WebDriver driver;
			//System.setProperty("webdriver.chrome.driver", "/Users/CurtA/SQA-Workspace/personal/driver/chromedriver_win32/chromedriver.exe");
		
			//driver = new ChromeDriver();
			
			System.setProperty("webdriver.gecko.driver",
		            "/Users/CurtA/SQA-Workspace/personal/driver/geckodriver-v0.19.1-win64/geckodriver.exe");	
			     
			driver = new FirefoxDriver();
		   baseUrl = "http://localhost:8080/SQA-DynamicProject/sample.html";
		 //  System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
	
		   driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.findElement(By.name("firstname")).sendKeys("curt");
		   driver.findElement(By.name("lastname")).sendKeys("Manning");

		  //    driver.findElement((By.id("email"))).sendKeys("test@gmail.com");

		      driver.findElement(By.name("genderFemale")).click();
		      
		  	WebElement element = driver.findElement(By.name("SeleniumTests"));
		  	//driver.findElement(By.xpath("//table[1]//tr[2]/").name))
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test1@gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys("test99@gmail.com");
			//driver.findElement(By.cssSelector("input[id='displayed-text']"));
			Thread.sleep(5000);
			driver.findElement(By.linkText("Visit our HTML tutorial"));
	
			   
			driver.findElement(By.partialLinkText("Visit"));
	
			
				Thread.sleep(2000);
				
			Select sel = new Select(element);
			
			Thread.sleep(2000);
			System.out.println("Select first by value");
			sel.selectByValue("BrowserCommands");
			Thread.sleep(2000);
			
			System.out.println("Select by index");
			sel.selectByIndex(2);
			
			Thread.sleep(2000);	
			System.out.println("Select SwitchCommands by visible text");
			sel.selectByVisibleText("SwitchCommands");
			
			Thread.sleep(2000);	
			System.out.println("Print the list of all options");
			List<WebElement> options = sel.getOptions();
			int size = options.size();
			
			for (int i=0; i<size; i++) {
				String optionName = options.get(i).getText();
				System.out.println(optionName);
			}
	}


}


