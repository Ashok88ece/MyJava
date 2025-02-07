package JavaCrashCourses;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> employeeMap = new HashMap<Integer,String>();
		
		//To insert an employee put method used
		
		employeeMap.put(1, "Ashok");
		employeeMap.put(2, "Arun");
		employeeMap.put(3, "Bala");
		employeeMap.put(4, "Sundar");
		employeeMap.put(5, "Gokul");
		
		System.out.println("Employee values are:"+employeeMap);
		
		//To make a copy of existing map
		
		HashMap<Integer,String> duplicatemap = new HashMap<Integer,String>();
		
		duplicatemap.putAll(employeeMap);
		
		System.out.println(duplicatemap);
		
		//Clear to delete the map contents
		duplicatemap.clear();
		System.out.println("After deleted:"+duplicatemap);
		
		//To check if a key is present or not in map
		System.out.println("To verify the key presence:"+employeeMap.containsKey(3));
		
		//To check if a value is present or not in map
				System.out.println("To verify the value presence:"+employeeMap.containsValue("Ashok"));
				
		//clone map
				
				System.out.println("Cloned Details:"+employeeMap.clone());
				
		  // Check if the map is empty or not
				System.out.println("To verify the map is Empty or Not:"+employeeMap.isEmpty());
				
		//Fetch the Set of Keys
				System.out.println("Fetch the set of keys"+employeeMap.keySet());
				
		//Fetch a value
				System.out.println("Fetch the value of :"+employeeMap.get(4));
				
		//Fetch All values
				System.out.println("TO get all the values :"+employeeMap.values());
				
		//Entry set retrieved all the keys and values\
				System.out.println("To get all the keys and values:"+employeeMap.entrySet());
	}

}
