package compiler_design;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScanner {
	private String path;
	private Scanner File;
	StreamTokenizer st;	

	public FileScanner(String path) throws FileNotFoundException, IOException {
		this.path = path;

		this.File = new Scanner(new java.io.File(path));
		this.st = new StreamTokenizer(new FileReader(this.path));
	}

	public ProtoToken[] gettoken() throws IOException {
		int colNum = 0;

		ArrayList<ProtoToken> tokenList = new ArrayList<ProtoToken>();

		// print the stream tokens
		boolean eof = false;
		do {

			int token = st.nextToken();

			switch (token) {
			
			case StreamTokenizer.TT_EOF:
				eof = true;
				break;
				
			case StreamTokenizer.TT_EOL:
				break;
				
			case StreamTokenizer.TT_WORD:
				
				tokenList.add(new WordToken(st.lineno(), colNum, st.sval));
				break;
				
			case StreamTokenizer.TT_NUMBER:
				tokenList.add(new NumberToken(st.lineno(), colNum, st.nval));
				break;
				
			default:
				tokenList.add(new OperatorToken(st.lineno(), colNum, ""+(char)token));
				if (token == '!') {
					eof = true;
				}
				break;
			}

		} while (!eof);
		
		return tokenList.toArray(new ProtoToken[0]);

	}

}
