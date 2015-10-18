
public class Token {
	String lexeme;	//keywords and constants
	String type;	//returned token
	int code;		//the number in the symbol table
	
	Token(String lexeme){
		this.lexeme = lexeme;
		SymbolTable.installID(lexeme);
		
	}
	Token(String lexeme, String type, int code){
		this.lexeme = lexeme;
		this.type = type;
		this.code = code;
	}

	private int getToken(String lexeme2) {
		
		return code;
	}
	
	
	
}


