package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatotsTutorial {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void test() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("karunasree");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Hello#123");
		Thread.sleep(3000);
		//	driver.findElement(By.className("form-submit")).click();
		//	driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.cssSelector(".form-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("arvindh");

	}

	@Disabled
	@Test
	void test1() throws InterruptedException {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("News")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Greater news")).click();		
	}
	@Disabled
	@Test
	void totalnumoflinks() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		System.out.println("Total num of links on Google:"+links.size());

	}

	@Test
	void xpath() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Karuna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[3]/div[2]/div[1]/form/label[3]/input")).click();

	}



}
