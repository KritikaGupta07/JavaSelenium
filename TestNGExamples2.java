package LearnTestNGExamples.LearnTestNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGExamples2 {
	
	@Test(priority = 1)
	public void loginToApplication(){
		
		System.out.println("Login To Application...");
	}
	@Test(priority = 2)
	public void makePayment() {
		
		System.out.println("Payment done by CC...");
	}
	@Test(priority = 3)
	public void collectReceipt() {
		
		System.out.println("Receipt Collected...");
	}
	@Test(priority = 4)
	public void logoutFromApplication() {
		
		System.out.println("Logout From Application...");
	}

}
