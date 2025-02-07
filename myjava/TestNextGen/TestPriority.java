package TestNextGen;

import org.testng.annotations.Test;

public class TestPriority {
	
	@Test(priority=0)
	public void StartTheCar() {
		
		System.out.println("Car Started");
	}
	@Test(priority=1)
	public void PutFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void SecondGear() {
		System.out.println("Secong Gear");
	}
	@Test(priority=3)
	public void ThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority=4)
	public void FourthGear() {
		System.out.println("Fourth Gear");
	}

}
