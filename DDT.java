package DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
	
	@Test(dataProvider = "appdata")
	public void test1(String arg1, String arg2) {
		
		System.out.println("Executed test 1 : " + arg1 + " " + arg2);
	}
	
	@DataProvider(name = "appdata")
	public Object[][] testData(){
		
		Object [][]arr = new Object[2][2];
		
		arr[0][0] = "Java";
		
		arr[0][1] = "JavaScript";
		
		arr[1][0] = "Python";
		
		arr[1][1] = "Ruby";
		
		return arr;
	}

	
}
