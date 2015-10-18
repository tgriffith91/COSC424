import java.lang.reflect.Field;


public class Token {
	static String lexeme;	//keywords and constants
	static String type;	//returned token
	static int code;		//the number in the symbol table
	
	Token(String lexeme){
		this.lexeme = lexeme;
		SymbolTable.installID(lexeme);
	}
	
	Token(String lexeme, String type, int code){
		this.lexeme = lexeme;
		this.type = type;
		this.code = code;
		SymbolTable.installID(lexeme);
	}
	
	
	public String getLexeme() {
		return lexeme;
	}
	
	public String getType() {
		return type;
	}

	public int getCode() {
		return code;
	}

	private int getToken(String lexeme2) {
		return code;
	}
	
	// found this online
	// we can make it iterate through tokens and print what we need
	//private int nextToken(Object obj) {
//	    for (Token token : token.getClass().getDeclaredFields()) {
//	        //field.setAccessible(true); // if you want to modify private fields
//	        System.out.println(field.getName()
//	                 + " - " + field.getType()
//	                 + " - " + field.get(obj));
//	    }
//	}
	
	// this is the exact online code
//	public int getObject(Object obj) {
//	    for (Field field : obj.getClass().getDeclaredFields()) {
//	        //field.setAccessible(true); // if you want to modify private fields
//	        System.out.println(field.getName()
//	                 + " - " + field.getType()
//	                 + " - " + field.get(obj));
//	    }
//	}
	// this is based off that code ^^
	public static void nextToken(Object obj) {
		for (Field field : obj.getClass().getDeclaredFields()) {
			//field.setAccessible(true); // if you want to modify private fields
			System.out.println(lexeme+" "+type+" "+code+"\n");
		}
	}
	
}


