package labExamPractice;

public class Recursion {
	/**
	 * Given a string that contains a single pair of parenthesis,
	 * compute recursively a new string of the characters between
	 * the parentheses.
	 * Example: "xyz(abc)123" yields "abc".
	 * 
	 * Assume the input string always contains pair of parenthesis
	 * 
	 * 
	 * parenBit("xyz(abc)123") → "abc"
	 * parenBit("x(hello)") → "hello"
	 * parenBit("(xy)1") → "xy"
	 * parenBit("()") → ""
	 */
	public String parenBit(String str) {
		// TODO: Write a recursive function to complete this method
		//
		// Note: The code below is simply a placeholder to allow the
		// code to compile and run.
		if (str.equals("")) { 
			return str;
		}
		if (str.charAt(0) == '(') {

			if (str.charAt(str.length() - 1) == ')') {
				return str.substring(1,str.length()-1);
			} else 
				return parenBit(str.substring(0, str.length() - 1));
		}else 
			return parenBit(str.substring(1));
	}
}
	



/***********************************************************************
 * This answer will not be included in the real exam
 public String parenBit(String str) {

 //
 // Note: The code below is simply a placeholder to allow the
 // code to compile and run.

 if (str.equals("")) return str;
 if (str.charAt(0) == '(') {

 if (str.charAt(str.length() - 1) == ')')
 return str.substring(1,str.length()-1);
 else
 return parenBit(str.substring(0, str.length() - 1));
 } else
 return parenBit(str.substring(1));
 }
 */