package JavaCrashCourses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayListExample {
	
	public void arrayListExample() {
		
		List<String> arraylist = new ArrayList<String>();
		arraylist.add("Kia");
		arraylist.add("Audi");
		arraylist.add("BMW");
		arraylist.add("Benz");
		arraylist.add("Kia");
		
		System.out.println(arraylist);
		
		System.out.println(arraylist.get(0));
		
		System.out.println(arraylist.indexOf("BMW"));
		
		System.out.println(arraylist.lastIndexOf("Kia"));
		
		List<String> anotherlist = new ArrayList<String>();
		anotherlist.addAll(arraylist);
		System.out.println(anotherlist);
		anotherlist.clear();
		System.out.println(anotherlist);
		
		arraylist.remove(0);
		System.out.println(arraylist);
		arraylist.remove("Benz");
		System.out.println(arraylist);
		
		arraylist.add(null);
		System.out.println(arraylist);
		
		arraylist.set(0, "Ford");
		System.out.println(arraylist);
		
		System.out.println(arraylist.isEmpty());
		
		//Iterate
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println("Using For Loop:"+arraylist.get(i));
		}
		
		System.out.println("*********************************");
		
		for (String string : arraylist) {
			System.out.println("Using For Each:"+string);
		}
		System.out.println("***********************************");
		
		ListIterator<String> list_iterator = arraylist.listIterator();
		
		while(list_iterator.hasNext()) {
			System.out.println(list_iterator.next());
		}
		
		System.out.println("*********************************");
		while(list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());
		}
		
		System.out.println("**********************************");
		
		Iterator<String> iterator = arraylist.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Concurrent Modification Exception
		//Arralist - Non Synchronized
		//Arraylist - Thread Safe - NO
		for (String string : arraylist) {
			System.out.println("Using For Each:"+string);
			//arraylist.add("Jeep");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListExample ale = new arrayListExample();
		ale.arrayListExample();
	
		
	}

}
