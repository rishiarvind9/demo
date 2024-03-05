package facebook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Login {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

	@Test
	void test() throws Exception {
		driver.findElement(By.id("email")).sendKeys("karunasree");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}

}
