package recursion;

public class move_char_end {

	public static void main(String[] args) {
		String s="axbxyxz";
		char el='x';
move(s,el,0,0,"");
	}
	public static void move(String s,char el,int idx,int count,String new_s) {
		if(idx==s.length()) {
			for(int i=0;i<count;i++) {
				new_s=new_s+'s';
			}
			System.out.println(new_s);
			return;
		}
		if(s.charAt(idx)==el) {
			count++;
			move(s,el,idx+1,count,new_s);
		}
		else {
			new_s=new_s+s.charAt(idx);
			move(s,el,idx+1,count,new_s);
		}
	}

}
