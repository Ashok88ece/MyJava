package ParameterDemo;

public class DynamicCalculator {
	
	public static String getMyfullname(String fname, String Lname) {
		String fullname = fname+Lname;
		return fullname;
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
