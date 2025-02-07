 package javaInterview;

public class SwapTwoNumbers {

	
	public void withthirdvariable() {
		
		
		int mySalary=20;
		
		int superiorSalary=50;
		
		System.out.println("Before Swapping MySalary:"+mySalary);
		System.out.println("Before Swapping superiorSalary:"+superiorSalary);
		
		System.out.println("*****************************************");
		
		int temp = mySalary;
		
		mySalary=superiorSalary;
		
		superiorSalary=temp;
		System.out.println("After Swapping MySalary:"+mySalary);
		System.out.println("After Swapping superiorSalary:"+superiorSalary);

	}	
	
	public void withoutthirdvariable() {
		
		int first=50; int second=30;
		
		System.out.println("Before Swapping MySalary:"+first);
		System.out.println("Before Swapping superiorSalary:"+second);
		System.out.println("**********************************");
		
		first = first-second;
		second=first+second;
		first=second-first;
		
		System.out.println("After Swapping MySalary:"+first);
		System.out.println("After Swapping superiorSalary:"+second);
		
	}

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SwapTwoNumbers swapping = new SwapTwoNumbers();
	swapping.withoutthirdvariable();
	

}
}