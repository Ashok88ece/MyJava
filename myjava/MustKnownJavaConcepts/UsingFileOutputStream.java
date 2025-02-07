package MustKnownJavaConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingFOS.txt";
		String content = "File Output Stream";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		
		byte[] Writethis = content.getBytes();
		
		fileOutputStream.write(Writethis);
		fileOutputStream.close();
		
		

	}

}
