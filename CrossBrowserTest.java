package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	
	@Parameters({"browser"})
	@Test
	public void verifyTitle(@Optional("Chrome") String browser) {
		
		System.out.println("Current Thread ID: " + Thread.currentThread().getId());
		
		System.out.println("Current Thread Name: " + Thread.currentThread().getName());
		
		System.out.println("Current Thread Priority: " + Thread.currentThread().getPriority());
		
		WebDriver driver = Utility.startBrowser(browser, "https://testng.org/#_parameters");
		
		Assert.assertTrue(driver.getTitle().contains("TestNG"),"Title mismatch");
		
		driver.quit();
		
	}
}
