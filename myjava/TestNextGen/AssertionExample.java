package TestNextGen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	
	public void test1() {
		System.out.println("Test 1 started");
		
		 Assert.assertEquals(13, 13 );
		 
		 System.out.println("Test 1 Completed");
	}
	
    @Test
	
	public void test2() {
    	System.out.println("Test 2 Started");
		
		 Assert.assertEquals(14, 14,"Values Does not matched raise a bug" );
		 System.out.println("Test 2 Completed");
	}
	
    @Test
	
   	public void test3() {
       	System.out.println("Test 3 Started");
   		
   		 Assert.assertEquals("Hello", "Hello","Values Does not matched raise a bug" );
   		 System.out.println("Test 3 Completed");
   	}
   	
}
