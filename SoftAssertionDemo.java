package Assertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	@Test
	public void test1() 
	{
		
		System.out.println("Start....");
		
		SoftAssert softAssert = new SoftAssert();
		
		AssertJUnit.assertEquals("12","13");
		
		AssertJUnit.assertEquals("Kritika", "Ritika");
		
		System.out.println("End...");
		
		softAssert.assertAll();

	}
		
}
