package MustKnownJavaConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.File Location 2. File Content
		
		 String location = "UsingFileWriter.txt";
		 String content = "Selenium Framework";
		 
		 FileWriter fileWriter = new FileWriter(location);
		 
		 fileWriter.write(content);
		 
		 fileWriter.close();
		 

	}

}
