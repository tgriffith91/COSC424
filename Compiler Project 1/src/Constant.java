/*
 * Constant Class - Defines a list of constant token values based on the language. 
 * As they are created they are added to the symbol table.
 */
public class Constant {

	public static final int ID = 100;
	public static final int NUM = 101;
	
	//********** keywords ***********
	
	public static final int IF = 102;
	stLex[0] = "if";
	stValue[0] = IF;
	public static final int INT = 103;
	stLex[1] = "int";
	stValue[1] = INT;
	public static final int DOUBLE = 104;
	stLex[2] = "double";
	stValue[2] = DOUBLE;
	public static final int ELSE = 105;
	stLex[3] = "else";
	stValue[3] = ELSE;
	public static final int WHILE = 106;
	stLex[4] = "while";
	stValue[4] = WHILE;
	
	
	//*********other constants************
	
	public static final int RELOP = 107;
	public static final int ASSIGNOP = 108;
	public static final int ADDOP = 109;
	public static final int MULTOP = 110;
	public static final int LPAREN = 111;
	public static final int RPAREN = 112;
	public static final int LBRACE = 113;
	public static final int RBRACE = 114;
	public static final int SCOLON = 115;
	public static final int COMMA = 116;
	
	
	
//	installID()

}
