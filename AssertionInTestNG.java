package Assertion;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {

	@Test
	public void testingAssertionMethod() {

		int actual = 10;

		int expected = 10;

		Assert.assertEquals(actual, expected);

		Assert.assertEquals(actual, expected, "Validation Failed...");

		System.out.println("Exit....");
	}

	@Test
	public void test2() {

		System.out.println("Start...");

		int actual = 10;

		int expected = 11;

		Assert.assertEquals(actual, expected, "Validation Failed...");

		Assert.assertEquals(actual, expected);

		System.out.println("Exit...");
	}

	@Test
	public void test3() {

		System.out.println("Started....");

		Assert.assertEquals("Mukesh", "Mahesh");

		System.out.println("Exit...");

	}

	@Test
	public void test4() {

		System.out.println("Started....");

		List<String> l1 = Arrays.asList("Java", "JavaScript");

		List<String> l2 = Arrays.asList("Java", "JavaScript", "Ruby");

		Assert.assertEquals(l1, l2, "Validation Failed...");

		Assert.assertEquals(l1, l2);

		System.out.println("Exit...");

	}

	@Test
	public void test5() {

		System.out.println("Started....");

		List<String> l1 = Arrays.asList("Java", "JavaScript");

		List<String> l2 = Arrays.asList("Java", "JavaScript", "Ruby");

		Assert.assertEquals(l1, l2, "Validation Failed...");

		Assert.assertNotEquals(l1, l2);

		System.out.println("Exit...");

	}

	@Test
	public void test6() {

		System.out.println("Started....");

		String str = "Welcome to Selenium World";

		Assert.assertTrue(str.contains("Kritika"), "Validation Failed");

		System.out.println("Exit...");

	}

	@Test
	public void test7() {

		System.out.println("Started....");

		String str = "Welcome to Selenium World";

		Assert.assertFalse(str.contains("Selenium"), "Validation Fail...");

		System.out.println("Exit...");

	}

}
