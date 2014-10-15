public class OperatorToken extends ProtoToken {
	private String lexeme;
	
	public OperatorToken(int lineNum, int colNum, String lexeme) {
		super(lineNum, colNum, SymbolTable.getOperatorTokenName(lexeme));
		this.lexeme = lexeme;
		
	}
	
	public String getLexeme() {
		return lexeme;
	}
	
	public String toString() {
		return getLexeme() + " " + SymbolTable.getOperatorTokenName(lexeme);
	}
}
