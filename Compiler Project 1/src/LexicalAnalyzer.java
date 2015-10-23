import java.nio.Buffer;
import java.util.*;
import java.io.*;

/*
 * @author Mary Kolojejchick 
 * @author Tom Griffith
 * 
 * A lexical analyzer - part of the compiler.
 */
public class LexicalAnalyzer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a line of code : ");
		String input = in.nextLine();

		int startIndex = 0;
		int endIndex = 0;

		char lookahead = input.charAt(endIndex);
		
		while(startIndex <= input.length()){
			System.out.println("" + nextToken());
		}
	}

}
