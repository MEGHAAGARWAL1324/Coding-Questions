package stack;
import java.util.*;


public class parenthesis_check {
	static Stack<Character> s=new Stack();
	public static boolean check_p(String ps) {
		int l=ps.length();
		for(int i=0;i<l;i++) {
			if(ps.charAt(i)=='(') {
				s.push('(');
			}
			else if(ps.charAt(i)==')') {
				if(s.isEmpty()) {
					return false;
				}
				else {
					s.pop();
				}
			}
			
		}
		if(s.isEmpty()) {
			return true;
		}
		else
		return false;
	}
public static void main(String[]args) {
	
	String ps="((8*6)((4+9)))";
	
	if(check_p(ps)) {
		System.out.print("Parenthesis is Match");
	}
	else {
		System.out.print("Parenthesis is Not Match");
	}
}
}
