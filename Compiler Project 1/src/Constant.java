
public class Constant {
	public static final Token t = new Token("if", "keyword", 900);
	public static final Token t1 = new Token("int", "keyword", 901);
	public static final Token t2 = new Token("double", "keyword", 902);
	public static final Token t3 = new Token("else", "keyword", 903);
	public static final Token t4 = new Token("while", "keyword", 904);
	public static final Token t5 = new Token("{", "grouping", 300);
	public static final Token t6 = new Token("}", "grouping", 301);
	public static final Token t7 = new Token("(", "grouping", 302);
	public static final Token t8 = new Token(")", "grouping", 304);
	public static final Token t9 = new Token(";", "semicolon", 305);
	public static final Token t10 = new Token(",", "comma", 306);
	public static final Token t11= new Token("==", "relop", 307);
	public static final Token t12 = new Token("!=", "relop", 308);
	public static final Token t13 = new Token("<", "relop", 309);
	public static final Token t14 = new Token("<=", "relop", 310);
	public static final Token t15 = new Token(">", "relop", 911);
	public static final Token t16 = new Token(">=", "relop", 912);
	public static final Token t17 = new Token("=", "assignop", 913);
	public static final Token t18 = new Token("+", "addop", 914);
	public static final Token t19 = new Token("-", "addop", 915);
	public static final Token t20 = new Token("*", "multop", 916);
	public static final Token t21 = new Token("/", "multop", 917);
	public static final Token t22 = new Token("/*", "comment", 918);
	public static final Token t23 = new Token("//", "comment", 919);
	public static final Token t24 = new Token("*/", "comment", 920);
	
	// iterate through token class
	// installID(Token.getLexeme());
	// then all constants will be installed in the table
	
	// actually installID gets called in the constructor for token so I don't 
	// think we need to do anything else to install it in the table
}
