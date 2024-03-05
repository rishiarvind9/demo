package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightDobleDragMouseKeyboard {
	WebDriver driver;

	@Test(enabled=false)
	public void rightclick() throws Exception {
		driver.get("https://www.seleniumlearn.com/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-386-1\"]/a"))).build().perform();
	}
	
	
	@Test(enabled=false)
	public void doubleclick() throws Exception {
		driver.get("https://www.seleniumlearn.com/double-click/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	}
	
	
	@Test(enabled=false)
	public void mousehover() throws Exception {
		driver.get("https://www.seleniumlearn.com/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().build().perform();
	}
	
	@Test(enabled=false)
	public void draganddrop() throws Exception {
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
		Thread.sleep(5000);     
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 1000)");
         Actions act=new Actions(driver);
         
         WebElement source=driver.findElement(By.id("draggable")); // Find the first WebElement using the given method.
         WebElement target=driver.findElement(By.id("droppable"));
         
         act.dragAndDrop(source,target).build().perform();
	}
	
	@Test
	public void keyboardfuncation() throws Exception {
		driver.get("https://redmine.org/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
         Actions act=new Actions(driver);
         act.sendKeys(Keys.ENTER).build().perform();
     
	}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
