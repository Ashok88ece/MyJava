package javaInterview;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenString = "Ashokkumar";
		
		System.out.println(givenString.length());
		
		char[] chararray = givenString.toCharArray();
		
		int length=0;
		for(char c :chararray) {
			
			length++;
		}
		System.out.println(length);

	}

}
