package DataDrivenTest;

import org.testng.annotations.Test;

public class ParallelMethodDemo {

	@Test
	public void test1() {
		
		System.out.println("Executed test1 with Thread ID: " + Thread.currentThread().getId());
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Executed test2 with Thread ID: " + Thread.currentThread().getId() );
	}
	
	@Test
	public void test3() {
		
		System.out.println("Executed test3 with Thread ID: " + Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {
		
		System.out.println("Executed test4 with Thread ID: " + Thread.currentThread().getId() );
	}
	
	@Test
	public void test5() {
		
		System.out.println("Executed test5 with Thread ID: " + Thread.currentThread().getId());
	}
	
}
