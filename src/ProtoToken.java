public class ProtoToken {
	private int lineNum;
	private int colNum;
	private String tokenName;
	
	public ProtoToken(int lineNum, int colNum, String tokenName) {
		//Each token contains these three fields.
		
		this.lineNum = lineNum;
		this.colNum = colNum;
		this.tokenName = tokenName;		
	}
	
	public int getColNum() {
		return this.colNum;
	}
	
	public int getLineNum() {
		return this.lineNum;
	}
	
	public String getTokenName() {
		return this.tokenName;
	}
	
	public String toString() {
		return this.tokenName;
	}
}
