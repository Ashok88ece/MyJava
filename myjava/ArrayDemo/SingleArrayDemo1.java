package ArrayDemo;

public class SingleArrayDemo1 {

	public static void main(String[] args) {

		int students_id[] = new int[5];
		
		students_id[0]=89;
		students_id[1]=90;
		students_id[2]=75;
		students_id[3]=65;
		students_id[4]=55;
		
		int sizeofArray = students_id.length;
		
		for (int i=0;i<sizeofArray;i++) {
			System.out.println("Length of Array is:"+students_id[i]);
		}
		

	}

}
