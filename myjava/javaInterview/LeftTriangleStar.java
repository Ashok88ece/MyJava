package javaInterview;

public class LeftTriangleStar {
	int a,b;
	static int row=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int a=0; a<row; a++) {
			for(int b=0; b<=a; b++) {
				System.out.println("* ");
			}
			System.out.println();
		}

	}

}
