package itec335;

import static org.junit.Assert.*;  

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class BackpackTest {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() {
		//Chrome Browser Testing
		System.setProperty("webdriver.chrome.driver", "/Users/rebec/chromedriver_win32/chromedriver");
		driver.get("https://sites.radford.edu/~tlewis32/itec335/backpacks.html"); 
	}

	@Test
	public void test() {
		String copy = "copy";
		//Testing Title
		assertEquals(driver.getTitle(), "Backpacks, Limited");
		assertNotNull(copy); //example of using assertNotNull
		
		//check images
		assertNotNull(driver.findElement(By.id("image1")));
		assertNotNull(driver.findElement(By.id("image2")));
		assertNotNull(driver.findElement(By.id("image3")));
		
		//check descriptions
		assertNotNull(driver.findElement(By.id("description1")));
		assertNotNull(driver.findElement(By.id("description2")));
		assertNotNull(driver.findElement(By.id("description3")));
		
		assertNotNull(driver.findElement(By.id("copyright1")));
		assertNotNull(driver.findElement(By.id("link4")));
		
		assertNotNull(driver.findElement(By.id("table1")));
		
		
	}


	@After
	public void tearDown() {
		driver.quit();
	}
}
