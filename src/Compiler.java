import java.io.FileNotFoundException;
import java.io.IOException;

public class Compiler {
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
//		User can pass the path from the command line.
//		Also, you can set the path in the file.
		if (args.length == 1) {
			FileScanner FileScanner = new FileScanner(args[0]);
		} else if (args.length > 1){
			throw new Exception("You can't enter more than two argument");
		}
		
		FileScanner FileScanner = new FileScanner("test.txt");
		
		ProtoToken result[] = FileScanner.gettoken();
		
		for (ProtoToken r:result) {
			System.out.println(r.toString());
		}
	}
}
