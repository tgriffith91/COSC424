import java.util.LinkedList;

public class SymbolTable {
	static int CODE = 100;
	static LinkedList<Token> table = new LinkedList<Token>();
	

	static int installID(String lexeme){
		//see if it exists already
			//if so return its index
		//if not create token
		Token newToken = new Token(lexeme, "ID", CODE++);
		//install in the table
		table.add(newToken);
		
		
		//return the index of the new token
		
		return 0;
	}
}
