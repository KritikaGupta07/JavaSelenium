package TestNGWithSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterAnnotation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("Setting up browser....");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
		System.out.println(" Closing browser...");
	}
	
	@Test
	public void loginToApplication() {
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		
		driver.findElement(By.className("submit-btn")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).getText().contains("Welcome"),"Login Failed...");
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("New user? Signup")).isDisplayed(),"Logout Failed...");
	}
	
	@Test
	public void verifyURL() {
		
		Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Could not Verify URL...");
	}
	
	@Test
	public void verifyTitle() {
		
		Assert.assertTrue(driver.getTitle().contains("Learn Automation"),"Could not Verify title...");
	}

}
