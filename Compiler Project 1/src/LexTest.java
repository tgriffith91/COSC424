
public class LexTest {

	public static void main(String[] args) {

		LexicalAnalyzer.readFile();

		// or something idk?
		Token.nextToken(SymbolTable.table.get(0));
	}

}
