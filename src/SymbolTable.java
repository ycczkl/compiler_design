import java.util.Hashtable;

public class SymbolTable {

	static final String[] reservedWords = { "var", "array", "function",
			"procedure", "begin", "if", "else", "while", "not", "end", "program", "div" };
	static final String[] reservedTokens = { "VARIABLE", "ARRAYTOK", "FUNCTIONTOK",
			"PROCEDURETOK", "BEGINTOK", "IFTOK", "ELSETOK", "WHILETOK", "NOTTOK", "ENDTOK", "PROGRAM", "MULOP" };

	

	static final String[] operators = { "*", "+", "-", "/", "=", ";", ",", ".",
			">", "<", "<=", ">=", "(", ")", ":=", "[", "]" };

	static final String[] operatorTokens = { "MULOP", "ADDOP", "ADDOP", "MULOP", "RELOP",
			"SEMICOLONTOKEN", "COMMATOKEN", "PERIODTOKEN", "RELOP", "RELOP", "RELOP", "RELOP",
			"OPENPARENTOKEN", "CLOSEPARENTOKEN", "ASSIGNTOKEN", "OPENBRACKETTOKEN", "CLOSEBRACKETTOKEN" };

	static Hashtable<String, String> symbols = new Hashtable<String, String>();
	

	static {
		// TODO Auto-generated constructor stub

		for (int i = 0; i < reservedWords.length; i++) {
			symbols.put(reservedWords[i], reservedTokens[i]);
		}
		for (int i = 0; i < operators.length; i++) {
			symbols.put(operators[i], operatorTokens[i]);
		}

	}

	public static String getWordTokenName(String lexeme) {
		return symbols.containsKey(lexeme) ? symbols.get(lexeme)
				: "identifiertoken";
	}

	public static String getOperatorTokenName(String lexeme) {
		return symbols.containsKey(lexeme) ? symbols.get(lexeme)
				: "<unidentfied operator>";
	}
}