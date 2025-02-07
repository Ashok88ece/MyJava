package Constructor;

public class Student {
	
	int result;

	public static void main(String[] args) {

		Student obj = new Student(1);
		obj.displayresult();

	}

	public Student() {
		System.out.println("Hey welcome to School");
	}
	
	public Student(String Scholname) {
		System.out.println("Hey Welcome to "+ Scholname+" School");
	}
	
	public Student(int rank) {
		
		System.out.println("Hey welcome to School :"+rank);
	}
	
	public Student (String Schoolname,int rank) {
		
		System.out.println("Hey welcome to School");
	}
	
	public void displayresult() {
		System.out.println("Final marks of the students is :"+result);
	}
}
