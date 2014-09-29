public class WordToken extends ProtoToken{
	
	private String lexeme;
	
	public WordToken( int lineNum, int colNum, String lexeme) {
		super( lineNum, colNum, "tokword");
		this.lexeme = lexeme;
		
	}
	
	public String getLexeme() {
		return lexeme;
	}
	
	public String toString() {
		return getLexeme() + "  tokword";
	}
}
