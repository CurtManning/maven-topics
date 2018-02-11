package week4.day4.testclasses;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://letskodeit.teachable.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/CurtA/SQA-Workspace/personal/driver/chromedriver_win32/chromedriver.exe");
	
		driver = new ChromeDriver();
		

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("Clicked on login");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("user_password")).sendKeys("test");
		System.out.println("Sending keys to password field");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing the username field");
		//driver.quit();
	}


}