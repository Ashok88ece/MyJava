package MustKnownJavaConcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathFileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingFilePath.txt";
		String content = "Hello Using File writing method using File path";
		
		Path path = Paths.get(location);
		
		Files.write(path, content.getBytes());

	}

}
