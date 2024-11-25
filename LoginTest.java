package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CrossBrowser.Utility;
import Pages.LoginPage;

public class LoginTest {
	
	@Test
	public void testLogin() {
		
		WebDriver driver = Utility.startBrowser("Chrome", "freelance-learn-automation.vercel.app/login");
		
//		driver.manage().window().maximize();
//		
//		driver.get("freelance-learn-automation.vercel.app/login");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.loginToApp("admin@email.com", "admin@123");
	}

}
