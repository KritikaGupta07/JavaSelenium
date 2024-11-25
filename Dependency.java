package DependencyAttribute;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	public void login() {
		
		System.out.println("Login to Application...");
	}
	@Test(dependsOnMethods = "login")
	public void logoutFromApplication() {
		
		System.out.println("Logout from application...");
	}

	@Test(dependsOnMethods = {"logoutFromApplication","login"})
	public void closeApp() {
		
		System.out.println("Closing application...");
	}
}
