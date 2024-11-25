package BreakOutAssignment;

import org.testng.annotations.DataProvider;

public class BreakOutLogin {
	
	@DataProvider(name = "login")
	public Object[][] loginData(){
		
		return new Object[][] {
		
			{"admin","admin@gmail.com","admin@123"},
			{"sunil","sunil@gmail.com","sunil@123"},
			{"rohan","rohan@gmail.com","rohan@123"}
		};

	}
}
