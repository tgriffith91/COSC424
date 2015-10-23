import java.lang.reflect.Field;

public class Token {
	static int lexeme; // keywords and constants number
	static int value; // the token's index in the symbol table

	// Parallel arrays used to make the symbol table
	String[] stLex = new String[25];
	int[] stValue = new int[25];

	/*
	 * Constructor for a token.
	 * 
	 * Lexeme is the constant value of the lexeme. Value is the index of the
	 * lexeme in the symbol table. If the constant value is that of a number
	 * then the value is the number itself.
	 */
	Token(int lexeme, int value) {
		this.lexeme = lexeme;
		this.value = value;
	}

	/*
	 * @param index - Uses the index passed to it to get the constant value from
	 * the symbol table.
	 * 
	 * @return - the constant value at the index.
	 */
	private int getToken(int index) {
		return stLex[index];
	}

	/*
	 * 
	 */
	private int installID(String lexeme){
		//test to see if it is in the table already
		int index = 0;
		while((!(lexeme.equals(stLex[index])) && (stLex[index] != null)){
			index++;
		}
		if(stLex[index] == null){
			stLex[index] = lexeme;
			stValue[index] = ID;
		}
		return index;
	}

	/*
	 * 
	 */
	private Token nextToken() {
		while(lookahead == ' ' || lookahead == '\n' || lookahead == '\t'){
			
		}
	}
}


















