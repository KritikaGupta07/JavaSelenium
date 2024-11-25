package Invocation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGInvocationCount {
	
	@Test(invocationCount = 5)
	public void test() {
		
		System.out.println("Hello TestNG...");
	}

}
