package recursion;

import java.util.HashSet;

public class uniq_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaa";
		HashSet<String> set=new HashSet<>();
		seq(s,0,"",set);

	}
	public static void seq(String s,int idx,String new_s,HashSet<String> set) {
		if(idx==s.length()) {
			if(set.contains(new_s)) {
				return;
			}
			else {
			System.out.println(new_s);
			set.add(new_s);
			return;
			}
		}
		char currchar=s.charAt(idx);
		seq(s,idx+1,new_s+currchar,set);
		seq(s,idx+1,new_s,set);
	}

}
