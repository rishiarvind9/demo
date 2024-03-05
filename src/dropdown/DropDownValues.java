package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDownValues {
	WebDriver driver;

	@Test
	public void dropdownselection() throws InterruptedException {
		driver.get("http://baalabharathi.com/upload-story/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='field-5vlVJGcSKva7av0']")).sendKeys("517502");
		Thread.sleep(3000);
		
		Select c = new Select(driver.findElement(By.xpath("//select[@id='field-5gVECDat8HE4BHW']")));
		c.selectByVisibleText("Pakistan");
		
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(7);
		
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("DE");
		
	//	new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("Canada");
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
