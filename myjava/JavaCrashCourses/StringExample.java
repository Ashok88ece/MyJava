package JavaCrashCourses;

public class StringExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ashokkumar";
		int number=5;

		System.out.println(name.charAt(0));
		
		System.out.println(name.contains("A"));
		
		System.out.println(name.equals("Ashokkumar"));
		
		System.out.println(name.equalsIgnoreCase("ASHOKKUMAR"));
		
		System.out.println(name.length());
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.substring(1));
		
		System.out.println(name.substring(1, 3));
		
		System.out.println(name.concat("Siddhu"));
		
		System.out.println(name.replace("r","R"));
		
		System.out.println(name.replace("Ashok","ASHOK"));
		
		System.out.println(name.indexOf("u"));
		
		System.out.println(name.indexOf("a", 0));
		
		System.out.println(name.trim());
		
		System.out.println(String.valueOf(number));
		
		String uppercase = "ASHOKKUMAR";
		System.out.println(uppercase.toLowerCase());
		
		String lowercase = "ashokkumar";
		System.out.println(lowercase.toUpperCase());
		
		//System.out.println(String.join("-","Learn","Automation","Online"));
		//System.out.println(String.join("_","Test", "Automation"));
		
	}

}
