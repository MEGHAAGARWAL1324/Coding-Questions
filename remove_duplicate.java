package recursion;

public class remove_duplicate {
	public static boolean[] map=new boolean[26];
public static void main(String[]args) {
	String s="axbxyxz";
	rem_dup(s,0,"");
}
public static void rem_dup(String s,int idx,String new_s) {
	if(idx==s.length()) {
		System.out.println(new_s);
		return;
	}
	if(map[s.charAt(idx)-'a']==true) {
		rem_dup(s,idx+1,new_s);
	}
	else {
		new_s=new_s+s.charAt(idx);
		map[s.charAt(idx)-'a']=true;
		rem_dup(s,idx+1,new_s);
	}
}
}
