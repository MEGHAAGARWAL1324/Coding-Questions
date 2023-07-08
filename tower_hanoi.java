package recursion;

public class tower_hanoi {
	public static void main(String []args) {
		int x=2;
		
		tower(x,"s","h","d");
	}
	public static void tower(int x,String s,String h,String d) {
		if(x==1) {
			System.out.println("Disk Transfer "+x+" from "+s+" to "+d);
			return;
		}
		tower(x-1,s,d,h);
		System.out.println("Disk Transfer "+x+" from "+s+" to "+d);
		tower(x-1,h,s,d);
	}
}
