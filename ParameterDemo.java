package CrossBrowser;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

	@Parameters({"browser","version"})
	@Test
	public void test1(String browser,String version) {
		
		System.out.println("Test 1 : " + browser + " Version: " + version);
	}
	
	//@Optional Annotation Example
	
	@Parameters({"browser","version"})
	@Test
	public void test2(@Optional("brave") String browser, @Optional("125") String version) {
		
		System.out.println("Test 2 : " + browser + " Version: " + version);
	}

}
