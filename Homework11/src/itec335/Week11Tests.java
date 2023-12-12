package itec335;

import org.testng.annotations.AfterClass;   
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class Week11Tests {
	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/rebec/chromedriver_win32/chromedriver");

		driver.get("https://www.browserstack.com/guide/ai-with-software-testing");

		System.out.println("Starting web browser");
	}

	@Test
	public void titleTesting() {
		Assert.assertEquals(driver.getTitle(), ("How AI can help Software Testing | BrowerStack | BrowserStack"));
	}

	@Test
	public void test1() {
		Assert.assertNotNull(driver.findElement(By.id("page__wrapper")));
		Assert.assertNotNull(driver.findElement(By.id("toc2")));
		Assert.assertNotNull(driver.findElement(By.id("toc3")));
		Assert.assertNotNull(driver.findElement(By.id("toc4")));
		
	}
	
	@Test
	public void test2() 
	{
		Assert.assertNotNull(driver.findElement(By.id("products-dd-toggle")));
		Assert.assertNotNull(driver.findElement(By.id("products-dd-tab-1")));
		Assert.assertNotNull(driver.findElement(By.id("products-dd-tab-2")));
		driver.get("https://www.browserstack.com/automate");
		Assert.assertEquals(driver.getTitle(), ("Automated Selenium Testing On A Grid of 3000+ Browsers & Mobile Devices | BrowserStack"));
		Assert.assertNotNull(driver.findElement(By.cssSelector("a[href='/users/sign_up?ref=automate-hero'")));
		//(By.cssSelector("a[title='Translation:Catullus 1']")));
		driver.get("https://www.browserstack.com/guide/ai-with-software-testing");
	}
	
	@Test
	public void test3()
	{
		Assert.assertNotNull(driver.findElement(By.id("toc2")));
		Assert.assertNotNull(driver.findElement(By.id("toc3")));
		Assert.assertNotNull(driver.findElement(By.id("toc4")));
		Assert.assertNotNull(driver.findElement(By.id("toc5")));
		Assert.assertNotNull(driver.findElement(By.cssSelector("a[title='How AI in Visual Testing is transforming the Testing Landscape'")));
	}
	
	@Test
	public void test4()
	{
		Assert.assertNotNull(driver.findElement(By.cssSelector("a[title='Events'")));
		Assert.assertNotNull(driver.findElement(By.cssSelector("a[title='Support'")));
	}

	@AfterClass
	public void afterMethod() {
		System.out.println("Closing the browser session");

		driver.quit();
	}

}
