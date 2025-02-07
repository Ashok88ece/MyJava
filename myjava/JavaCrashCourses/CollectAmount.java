package JavaCrashCourses;

public class CollectAmount {
	
	public Integer collectedAmount=1000;
	
	
	public Integer collecttheamountandgiveittome() {
		System.out.println("Amount Collected :"+collectedAmount +"Sent to you");
		return collectedAmount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectAmount amount = new CollectAmount();
		Integer cash = amount.collecttheamountandgiveittome();
		System.out.println("Got the Amount:"+cash);

	}

}
