package recursion;

public class string_reverse {
public static void main(String[]args) {
	String s="megha";
	int idx=s.length();
	reverse(s,idx-1);
}
public static void reverse(String s,int idx) {
	if(idx==0) {
		System.out.print(s.charAt(idx));
		return;
	}
	System.out.print(s.charAt(idx));
	reverse(s,idx-1);
}
}
