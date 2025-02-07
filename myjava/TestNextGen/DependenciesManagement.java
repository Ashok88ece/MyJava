package TestNextGen;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool")
	public void HigherSecondary() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "HigherSecondary")
	public void Engineering() {
		System.out.println("Engineering");
	}

}
