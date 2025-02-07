package conditionalstatements;

public class switchcase {

	public static void main(String[] args) {
		
		int x=5;
		
		switch(x)
		{
		
		case 1:
			System.out.println("Poor Perfomrer");
			break;
		case 2:
			System.out.println("Avg Perfomrer");
			break;
		case 3:
			System.out.println("Meet Expectation");
			break;
		case 4:
			System.out.println("Keep Rocking");
			break;
		case 5:
			System.out.println("Employee of the Year");
			break;
			
			default:
				System.out.println("You are Fired");
		}

	}

}
