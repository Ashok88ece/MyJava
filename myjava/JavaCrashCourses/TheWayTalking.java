package JavaCrashCourses;


public class TheWayTalking {
	
	public void talk(Parents styleoftalking) {
		System.out.println("Polite and Respectful");
		
	}
	
	public void talk(Boss styleoftalking) {
		System.out.println("Work Related Talks");
		
	}
	
	public void talk(Friends styleoftalking) {
		System.out.println("Talking Closely");
	}
	
	public static void main (String [] args) {
		
		TheWayTalking obj = new TheWayTalking();
	    Parents parents = new Parents();
	    obj.talk(parents);
	    
	    Boss boss = new Boss();
	    obj.talk(boss);
	    
	    Friends friends = new Friends();
	    obj.talk(friends);
		
		
		
	}

}
