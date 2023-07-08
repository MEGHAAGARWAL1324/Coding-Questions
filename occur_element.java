package recursion;

public class occur_element {
	public static int f=-1;
	public static int l=-1;
public static void main(String[] args) {
	String s="absssdaaadcsa";
	char el='d';
	f_l_el_occur(s,el,0);
}
public static void f_l_el_occur(String s,char el,int idx) {
	if(idx==s.length()) {
		System.out.println(f);
		System.out.println(l);
		return;
	}
	if(s.charAt(idx)==el) {
		if(f==-1) {
			f=idx;
		}
		else {
			l=idx;
		}
	}
	f_l_el_occur(s,el,idx+1);
}
}
