package alertpopupwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindowHandles 
{
	WebDriver driver;

	@Test
	public void okbutton() throws InterruptedException 
	{
		driver.get("http://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(7000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 1000)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		 driver.switchTo().alert().accept();		

	}
	
	@Test
	public void cancelbutton() throws InterruptedException {
		driver.get("http://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(7000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 1000)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
				

	}
	
	
	@Test
	public void sendtextinalertokbutton() throws InterruptedException {
		driver.get("http://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(7000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 1000)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Karuna");
		driver.switchTo().alert().accept();
				

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
