package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_TimeOut {
	
	WebDriver driver;
	
	@Test
	public void method1() {
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Tirupati");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//div[@class='hdtb-mitem']//a[contains(text(),'Images')]")).click();
	
	}
	
	@Test(timeOut=5000)
	public void method2() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("karunasreekantipuly");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='hdtb-mitem']//a[contains(text(),'Images')]")).click();
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	

}
