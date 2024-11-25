package DataDrivenTest;

import org.testng.annotations.DataProvider;

public class DDTFromOtherClass {

	@DataProvider(name = "appdata")
	public static Object[][] testData(){
		
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
