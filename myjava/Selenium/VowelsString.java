package Selenium;

public class VowelsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "AEIOU";
        System.out.println("Vowels in the string: ");

        // Convert the string to lowercase for case-insensitive checking
        String lowerCaseString = inputString.toLowerCase();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            char ch = lowerCaseString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
        System.out.println(); // For a new line after printing vowels
		
		
	}

}
