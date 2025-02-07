package JavaCrashCourses;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,String> placesinchennai = new TreeMap<String,String>();
		
		placesinchennai.put("Adyar", "Chennai");
		placesinchennai.put("T nagar", "Chennai");
		placesinchennai.put("Guindy", "Chennai");
		placesinchennai.put("KK Nagar", "Chennai");
		
		placesinchennai.put("Chennai","ECR");
		placesinchennai.put("Chennai", "Thiruvanmiyur");
		
		// Null key Insertion not allowed
		
		//placesinchennai.put(null, "Chennai"); 
		//placesinchennai.put(null, "Chennai");
		
		System.out.println(placesinchennai);

	}

}
