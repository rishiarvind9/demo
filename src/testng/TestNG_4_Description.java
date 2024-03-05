package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_Description {
	
	WebDriver driver;
	
	@Test(description="Twitter")
	public void TC_1() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(description="Facebook")
	public void TC_2() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(description="Google")
	public void TC_3() {
		driver.get("https://www.google.com");
	}
	
	@Test(description="Selenium")
	public void TC_4() {
		driver.get("www.selenium.dev");
	}
	
	@Test(description="Gmail")
	public void TC_5() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(description="Redmine")
	public void TC_6() {
		driver.get("www.redmine.org");
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
