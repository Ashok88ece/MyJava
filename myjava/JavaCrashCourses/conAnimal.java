package JavaCrashCourses;

public class conAnimal {
	
	String animal_name;
	String animal_type;
	
	conAnimal(String name,String type){
		
		animal_name = name;
		animal_type = type;
	}

	public void sayaboutanimal() {
		System.out.println("Animal name is "+animal_name+" And type is "+animal_type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		conAnimal animal1 = new conAnimal("Lion", "King of Jungle");
		animal1.sayaboutanimal();
		
		conAnimal animal2 = new conAnimal("Tiger", "Queen of Jungle");
		animal2.sayaboutanimal();

	}

}
