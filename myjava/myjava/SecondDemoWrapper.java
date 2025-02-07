package myjava;

public class SecondDemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String price1 ="463.95";
		
		String price2 = "237.05";
		
		//int p1 = Integer.parseInt(price1);
		//int p2 = Integer.parseInt(price2);
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		System.out.println(p1+p2);
		
		double sum=p1+p2;
		
		if(sum==701.00) {
			
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
