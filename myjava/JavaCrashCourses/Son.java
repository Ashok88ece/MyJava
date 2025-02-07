package JavaCrashCourses;

public class Son extends Parents {
	
	
	@Override
	
	public void marraige() {
		
		System.out.println("My Marraige My Rules");
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Parents parents = new Son();
		parents.property();
		parents.marraige();
	
		

	}

}
