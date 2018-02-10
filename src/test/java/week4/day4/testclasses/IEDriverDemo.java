package week4.day4.testclasses;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) {
		// http://selenium-release.storage.googleapis.com/index.html

		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", "C:/Users/CurtA/SQA-Workspace/personal/lib/IEDriverServer_x64_3.8.0/IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		
		String baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
		driver.get(baseUrl);
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


