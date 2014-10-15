public class WordToken extends ProtoToken{
	
	private String lexeme;
	
	public WordToken( int lineNum, int colNum, String lexeme) {
		super( lineNum, colNum, SymbolTable.getWordTokenName(lexeme));
		this.lexeme = lexeme;
		
	}
	
	public String getLexeme() {
		return lexeme;
	}
	
	public String toString() {
		return getLexeme() + " " + this.getTokenName();
	}
}
