package ClassDemo;

public class FirstClassDemo {

	int x=90;
	int y=100;
	
	
	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		FirstClassDemo obj1 = new FirstClassDemo();
		
		obj1.sum();
						
		System.out.println("X value is "+obj1.x);
		System.out.println("Y value is "+obj1.y);
		System.out.println("Program Ended");
	}
	
	public void sum() {
		int a=90;
		int b=100;
		int c=b+a;
		System.out.println("Sum of two numbers "+c);
	}

}
