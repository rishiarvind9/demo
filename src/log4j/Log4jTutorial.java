package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;
	@Test
	public void googlesearch() {
		
		  Logger log= Logger.getLogger("Search");
		  PropertyConfigurator.configure("Log4j.properties");
		
		  driver = new ChromeDriver();
		  log.info("To launch chrome browser");
		  
		  driver.manage().window().maximize();
		  log.info("Browser window maximized");
		  
		  driver.get("https://www.google.com");
		  log.info("Navigate the google application");
		  
		  driver.findElement(By.name("q")).sendKeys("Tirupati");
		  log.info("In google search filed type the Tirupati");
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  log.info("Enter button pressed by keyboard");
		
		
	}
}
