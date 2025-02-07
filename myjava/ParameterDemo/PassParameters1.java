package ParameterDemo;

public class PassParameters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicCalculator obj = new DynamicCalculator();
		int sum=obj.add(40, 50);
		System.out.println("Result is:" +sum);
		double result=obj.sub(90, 120);
		System.out.println("Result is :" +result);
		
		String fullname = obj.getMyfullname("Ashok", "Kumar");
		System.out.println("Congrats:" +fullname);


	}
	
	
}
