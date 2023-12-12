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

import junit.framework.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Exam2Test {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() {
		//Chrome Browser Testing
		System.setProperty("webdriver.chrome.driver", "/Users/rebec/chromedriver_win32/chromedriver");
		driver.get("https://en.wikisource.org/wiki/Translation:The_poems_of_Catullus"); 
	}

	@Test
	public void test() {
		String copy = "copy";
		//Testing Title
		assertEquals(driver.getTitle(), "The poems of Catullus - Wikisource, the free online library");
		assertNotNull(copy); //example of using assertNotNull
		
		assertNotNull(driver.findElement(By.cssSelector("a[title='Translation:Catullus 1']")));
		assertNotNull(driver.findElement(By.cssSelector("a[href='/wiki/Translation:Catullus_1']")));
				//cssSelector("[title=\"Translation:Catullus_1\"]")));
		
		assertNotNull(driver.findElement(By.cssSelector("a[title='Translation:Catullus 52']")));
		assertNotNull(driver.findElement(By.cssSelector("a[href='/wiki/Translation:Catullus_52']")));
		
		assertNotNull(driver.findElement(By.cssSelector("a[title='Translation:Catullus 38']")));
		assertNotNull(driver.findElement(By.cssSelector("a[href='/wiki/Translation:Catullus_38']")));
		
		assertNotNull(driver.findElement(By.cssSelector("a[title='Translation:Catullus 116']")));
		assertNotNull(driver.findElement(By.cssSelector("a[href='/wiki/Translation:Catullus_116']")));
		
		assertNotNull(driver.findElement(By.cssSelector("a[title='Translation:Catullus 7']")));
		assertNotNull(driver.findElement(By.cssSelector("a[href='/wiki/Translation:Catullus_7']")));
		
		
	}


	@After
	public void tearDown() {
		driver.quit();
	}
}
