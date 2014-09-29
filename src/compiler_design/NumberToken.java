package compiler_design;

public class NumberToken extends ProtoToken{
	private double lexeme;
	
	public NumberToken(int lineNum, int colNum, double lexeme) {
		super(lineNum, colNum, "toknumber");
		this.lexeme = lexeme;
		
	}
	
	public double getLexeme() {
		return lexeme;
	}
	
	public String toString() {
		return getLexeme() + "  toknumber";
	}
}
