package BreakOutAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreakOutLoginTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://freelance-learn-automation.vercel.app/signup");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(dataProvider = "login", dataProviderClass = BreakOutLogin.class)
	public void testLogin(String name, String email, String password) {

		WebElement nameField = driver.findElement(By.id("name"));

		nameField.sendKeys("name");

		WebElement emailField = driver.findElement(By.id("email"));

		emailField.sendKeys("email");

		WebElement passField = driver.findElement(By.id("password"));

		passField.sendKeys("password");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//input[@value = 'Male']"));

		Select state = new Select(driver.findElement(By.id("state")));

		state.selectByVisibleText("Karnataka");

		Select hobbies = new Select(driver.findElement(By.xpath("//select[contains(@id,'hobbi')]")));

		hobbies.selectByVisibleText("Playing");

		driver.findElement(By.xpath("//button[text() = 'Sign up']")).click();

		String title = driver.getTitle();

		Assert.assertTrue(title.contains("Learn"), "Login Fail");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
