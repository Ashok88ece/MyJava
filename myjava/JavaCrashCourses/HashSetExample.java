package JavaCrashCourses;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public void bacisexampleHashset() {
		
		//Number of Constructors available in HashSet/
		
		//1. HashSet hs = new Hashset();
		//2. HashSet hs  =new HashSet(int intitalSize);
		//3. HashSet hs = new HashSet(int initialSize,float fillRatio)
		//4. Hashset hs = new HashSet(Collection c)
		
		HashSet<String> hashset = new HashSet<String> ();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		hashset.add("Null");
		hashset.add("E");
		hashset.add("D");
		System.out.println("Contents of Hashset:"+hashset);
		
		hashset.remove(null);
		
		
		System.out.println("Contents of Hashset:" +hashset);
		
		
		
		System.out.println(hashset.contains("A"));
	}
	
	public void hashsetiterator() {
		
		HashSet<String> hashset1 = new HashSet<String>();
		hashset1.add("AB");
		hashset1.add("CD");
		hashset1.add("EF");
		hashset1.add("GH");
		
		Iterator<String> iterate = hashset1.iterator();
		
		while(iterate.hasNext()){
			System.out.println(iterate.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSetExample hs = new HashSetExample();
		hs.hashsetiterator();
		//hs.bacisexampleHashset();
	}

}
