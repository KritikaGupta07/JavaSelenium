package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Utility {
	
	public static WebDriver startBrowser(String browser, String url) {
		
		WebDriver driver = null;
		
		if(browser.contains("Chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browser.contains("Firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(browser.contains("Edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browser.contains("Safari")) {
			
			driver = new SafariDriver();
		}
		else {
			
			System.out.println("Sorry, we don't support this browser - please use Chrome, Firefox, Edge or Safari.");
		}
		
		browserSetting(driver,url);
		
		return driver;
	}
	
	public static void browserSetting(WebDriver driver, String url) {
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
