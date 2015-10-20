/*
 * Constant Class - Defines a list of tokens based on the language. 
 * As they are created they are added to the symbol table.
 */
public class Constant {
	public static final Token t = new Token("if", "keyword", 900);
	public static final Token t1 = new Token("int", "keyword", 901);
	public static final Token t2 = new Token("double", "keyword", 902);
	public static final Token t3 = new Token("else", "keyword", 903);
	public static final Token t4 = new Token("while", "keyword", 904);
	public static final Token t5 = new Token("{", "grouping", 905);
	public static final Token t6 = new Token("}", "grouping", 906);
	public static final Token t7 = new Token("(", "grouping", 907);
	public static final Token t8 = new Token(")", "grouping", 908);
	public static final Token t9 = new Token(";", "semicolon", 909);
	public static final Token t10 = new Token(",", "comma", 910);
	public static final Token t11= new Token("==", "relop", 911);
	public static final Token t12 = new Token("!=", "relop", 912);
	public static final Token t13 = new Token("<", "relop", 913);
	public static final Token t14 = new Token("<=", "relop", 914);
	public static final Token t15 = new Token(">", "relop", 915);
	public static final Token t16 = new Token(">=", "relop", 916);
	public static final Token t17 = new Token("=", "assignop", 917);
	public static final Token t18 = new Token("+", "addop", 918);
	public static final Token t19 = new Token("-", "addop", 919);
	public static final Token t20 = new Token("*", "multop", 920);
	public static final Token t21 = new Token("/", "multop", 921);
	public static final Token t22 = new Token("/*", "comment", 922);
	public static final Token t23 = new Token("//", "comment", 923);
	public static final Token t24 = new Token("*/", "comment", 924);
	
}
