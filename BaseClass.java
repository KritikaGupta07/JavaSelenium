package AnnotationExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("Before Method Execution...");
	}
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("After Method Execution...");
	}
	
	@BeforeClass
	public void setUpClass() {
		
		System.out.println("Before Class Execution...");
	}
	
	@AfterClass
	public void tearDownClass() {
		
		System.out.println("After Class Execution...");
	}
	
	@BeforeTest
	public void setUpTest() {
		
		System.out.println("Before Test Execution...");
	}
	
	@AfterTest
	public void tearDownTest() {
		
		System.out.println("After Test Execution...");
	}
	
	@BeforeSuite
	public void setUpSuite() {
		
		System.out.println("Before Suite Execution...");
	}
	
	@AfterSuite
	public void tearDownSuite() {
		
		System.out.println("After Suite Execution...");
	}

}
