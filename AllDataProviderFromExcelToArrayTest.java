package ReadingDataFromExcel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllDataProviderFromExcelToArrayTest {

	@Test(dataProvider = "appdatafromexcel", dataProviderClass = AllDataProviderFromExcelToArray.class)
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
}
