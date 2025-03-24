package playground.E001;


import java.io.File;
import playground.E001.tools.FileIO;

import java.nio.file.Path;
import java.nio.file.Paths;
public class ErsteTestFile {

	public static void main(String[] args) {
		
		Path path = Paths.get("src/playground/E001/test.txt");
		
		System.out.printf(path.toAbsolutePath().toString());
		FileIO.openWriter(path.toAbsolutePath().toString());
		
		FileIO.println("Test");

	}

}
