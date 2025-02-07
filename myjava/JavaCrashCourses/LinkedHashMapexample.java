package JavaCrashCourses;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LinkedHashMap<String,String> name = new LinkedHashMap<String,String>();
	
		name.put("TL", "Sundar");
		name.put("Tester", "Ashok");
		name.put("Dev", "Lakshman");
		name.put("PM", "Gowdham");
		
		System.out.println(name);
		
		HashMap<String,String> employeeMap = new HashMap<String,String>();
		
		employeeMap.put("TL", "Sundar");
		employeeMap.put("Tester", "Ashok");
		employeeMap.put("Dev", "Lakshman");
		employeeMap.put("PM", "Gowdham");
		
		System.out.println(employeeMap);
		
}

}
