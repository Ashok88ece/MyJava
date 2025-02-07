package JavaCrashCourses;

public class BankAccount {
	
	long accountNumber = 123456789l;
	
	String accountHoldername = "Ashok";
	
	Integer accountBalance = 500;
	
	public void getBalance() {
		
		System.out.println("Account Balance is :" +accountBalance);
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		account.getBalance();

	}

}
