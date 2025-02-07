package JavaCrashCourses;

import java.util.LinkedList;

public class Linkedlistexample {
	
	public void linkedlistexamples() {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		
		System.out.println("List of Linedlist:"+linkedlist);
		
		linkedlist.addFirst(1);
		
		System.out.println(linkedlist);
		
		linkedlist.addLast(7);
		
		System.out.println(linkedlist);
		
		System.out.println("Get First Value:"+linkedlist.getFirst());
		
		System.out.println("Get first value using index :"+linkedlist.get(0));
		
		System.out.println("Get first value using index :"+linkedlist.get(3));
		
		System.out.println("Remove First:"+linkedlist.removeFirst());
		System.out.println(linkedlist);
		
		System.out.println("Remove Last:"+linkedlist.removeLast());
		System.out.println(linkedlist);
		
		//Poll() and pollFirst() delete the first element
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist);
		//Remove deleted the first element
		linkedlist.remove();
		System.out.println(linkedlist);
		//PollLast delete the last element
		linkedlist.pollLast();
		System.out.println(linkedlist);
		
	
	
	linkedlist.add(10);
	linkedlist.add(21);
	linkedlist.add(32);
	linkedlist.add(43);
	linkedlist.add(54);
	linkedlist.add(65);
	
	linkedlist.removeFirstOccurrence(21);
	
	System.out.println("Remove the first occurence of 21:"+linkedlist);
	
	linkedlist.removeLastOccurrence(43);
	System.out.println("Remove the Last occurence of 43:"+linkedlist);
		
	}
	
	public void linkedlistiterationforloop() {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(15);
		linkedlist.add(16);
		linkedlist.add(17);
		linkedlist.add(18);
		linkedlist.add(19);
		
		for(int i=0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
	}
	
	public void iteratiobforeachloop() {
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("A");
		linkedlist.add("B");
		linkedlist.add("C");
		linkedlist.add("D");
		linkedlist.add("E");
		
		for(String string : linkedlist) {
			System.out.println(string);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlistexample linkedlist = new Linkedlistexample();
		
		
		//linkedlist.linkedlistexamples();
		
		//linkedlist.linkedlistiterationforloop();
		linkedlist.iteratiobforeachloop();

	}

}
