package recursion;

public class subsequence {
public static void main(String[]args) {
	String s="abc";
	seq(s,0,"");
}
public static void seq(String s,int idx,String new_s) {
	if(idx==s.length()) {
		System.out.println(new_s);
		return;
	}
	char currchar=s.charAt(idx);
	seq(s,idx+1,new_s+currchar);
	seq(s,idx+1,new_s);
}
}
