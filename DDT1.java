package DataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT1 {
	
	@Test(dataProvider = "appdata")
	public void test1(String user, String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.id("email1")).sendKeys(user);
		
		driver.findElement(By.id("password1")).sendKeys(pass);
				
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	@DataProvider(name = "appdata")
	public Object[][] testData(){
		
		Object [][]arr = new Object[3][2];
		
		arr[0][0] = "admin@gmail.com";
		
		arr[0][1] = "admin";
		
		arr[1][0] = "mukesh@gmail.com";
		
		arr[1][1] = "admin";
		
		arr[2][0] = "madhuri@gmail.com";
		
		arr[2][1] = "admin";
 				
		return arr;
	}

}
