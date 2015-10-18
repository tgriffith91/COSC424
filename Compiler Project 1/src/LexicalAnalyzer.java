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
	
	static String readFile(){
		//get filename from user
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a file name:  ");
	String fileName = in.next();
	System.out.println();

	
	Scanner inFile = null;

	// open file
	try {
		inFile = new Scanner( new File( fileName ) );
	} 
	catch ( FileNotFoundException e ) {
		System.err.println( "Error : file not found" );
	}

	// process file
	while ( inFile.hasNext() ) {
		// two buffers to read in and do all that stuff with

	}

	// close file
	inFile.close();

	
	
	String buffer = null;
	return buffer;
	}
	
	
	//return token for next identified lexeme
	private Token nextToken(){
		
		
		return null;
		
		
		
	}
	
	
	
	
	
}
