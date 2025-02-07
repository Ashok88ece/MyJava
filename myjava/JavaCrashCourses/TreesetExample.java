package JavaCrashCourses;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	
	public void treesetExample() {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(10);
		treeset.add(2);
		treeset.add(4);
		treeset.add(9);
		treeset.add(11);
		
		System.out.println("TreeSet Order By:"+treeset);
		
		//First
		System.out.println("First element from Treeset:"+treeset.first());
		
		//Last
		System.out.println("Last element from Treeset:"+treeset.last());
		
		//HeadSet
		
		System.out.println("Provide the value lesser than what we give"+treeset.headSet(9));
		
		//TailSet
		System.out.println("Provided the value equalt and higher than what we give:"+treeset.tailSet(4));
		
		//Normal Iterator
		Iterator<Integer> iterator =  treeset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Descendin Iterator
		
		Iterator<Integer> desciterator = treeset.descendingIterator();
		while(desciterator.hasNext()) {
			System.out.println(desciterator.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreesetExample obj = new TreesetExample();
		obj.treesetExample();

	}

}
