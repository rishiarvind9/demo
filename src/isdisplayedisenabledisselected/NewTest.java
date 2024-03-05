package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
	
	@Test
	public void isdisplayedmethod() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(3000);
		 boolean hlp = driver.findElement(By.xpath("//a[@class='help']")).isDisplayed();
		 
		 if(hlp==true)
		 {
			 System.out.println("Help menu is available on top menu bar");
			 driver.findElement(By.xpath("//a[@class='help']")).click();
		 }
		 
		 else
		 {
			 System.out.println("Help menu is Not available on top menu bar");
		 }
	}
	
	
	@Test
	public void isenabledmethod() throws InterruptedException {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(3000);
		 boolean log = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
		 
		 if(log==true)
		 {
			 System.out.println("Login text box is enabled to enter username");
			 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Karuna");
		 }
		 
		 else
		 {
			 System.out.println("Login text box is Not enabled to enter username");
		 }
	}
	
	
	@Test
	public void isselectedmethod() throws InterruptedException {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
		 boolean check = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
		 
		 if(check==true)
		 {
			 System.out.println("Stay loggend in check box field is Selected");
		 }
		 
		 else
		 {
			 System.out.println("Stay loggend in check box field is Not Selected");
		 }
		 
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
