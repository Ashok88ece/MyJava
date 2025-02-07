package ParameterDemo;

public class PassParameters {

	public static void main(String[] args) {

		PassParameters obj = new PassParameters();
		int sum=obj.add(40, 50);
		System.out.println("Result is:" +sum);
		double result=obj.sub(90, 120);
		System.out.println("Result is :" +result);


	}
	
	public int add(int a, int b) {
		
		int c=a+b;
		return c;
	}

	public double sub(double x, double y) {
		
		double result = y-x;
		return result;
		
	}
}
