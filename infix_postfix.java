package stack;
import java.util.*;

public class infix_postfix {
	
	public static String infix_to_postfix(String infix) {
		Stack<Character>s=new Stack<>();
		String res="";
		for(int i=0;i<infix.length();i++) {
			if((infix.charAt(i)>='A' && infix.charAt(i)<='Z' )||(infix.charAt(i)>='a' && infix.charAt(i)<='z')) {
				res=res+infix.charAt(i);
			}
			else if(infix.charAt(i)=='('){
				s.push(infix.charAt(i));
			}
			else if(infix.charAt(i)==')'){
				while(s.isEmpty() && s.peek()!='(') {
					res=res+s.peek();
					s.pop();
				}
				
				
			}
			else {
				while(!s.isEmpty() && prec(s.peek())>prec(s.peek())) {
					res=res+s.peek();
					s.pop();
				}
				s.push(infix.charAt(i));
			}
		}
		while(!s.isEmpty()) {
			res=res+s.peek();
			s.pop();
		}
		return res;
		
	}
	public static int prec(char c) {
		if(c=='/' || c=='*') {
			return 2;
		}
		else if(c=='+' || c=='-') {
			return 1;
		}
		else {
			return -1;
		}
	}
public static void main(String[] args) {
	
	String infix="((a+(b*c))-d)";
	String postfix=infix_to_postfix(infix);
	System.out.println(postfix);
}
}
