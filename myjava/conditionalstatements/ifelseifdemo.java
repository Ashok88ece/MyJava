package conditionalstatements;

public class ifelseifdemo {
	
	public static String browser = "ie";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.out.println("Test Case executed in chrome");
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) 
		{
			System.out.println("Test Case executed in Firefox");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
		 System.out.println("Test Case executed in IE");	
		}
		
		else {
			System.out.println("Kinldy Provide valid browser name");
		}

	}
}
