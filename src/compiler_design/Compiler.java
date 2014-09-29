package compiler_design;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compiler {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileScanner FileScanner = new FileScanner("test.txt");
		
		ProtoToken result[] = FileScanner.gettoken();
		
		for (ProtoToken r:result) {
			System.out.println(r.toString());
		}
	}
}
