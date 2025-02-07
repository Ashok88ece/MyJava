package TestNextGen;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {

	
	@Test
	public void testsoft() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 soft started");
		assertion.assertEquals(12,12,"Count doesn't match");
		System.out.println("Test 1 soft stopped");
		assertion.assertAll();
		
	}
	@Test
	public void testhard() {
		
		System.out.println("Test 2 soft started");
		Assert.assertEquals(13,13);
		System.out.println("Test 2 soft stopped");
		
	}
}
