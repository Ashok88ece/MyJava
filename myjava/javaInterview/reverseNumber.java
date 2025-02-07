package javaInterview;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNumber=123;
		
		int reverseNumber=0;
		
		System.out.println("Enter Your Number :");
		
		Scanner scanner = new Scanner(System.in);
		givenNumber=scanner.nextInt();
		
		while(givenNumber !=0) {
		reverseNumber = reverseNumber*10;
		
		reverseNumber = reverseNumber+givenNumber%10;
		
		givenNumber=givenNumber/10;
		
		}
		System.out.println(reverseNumber);
	}

}
