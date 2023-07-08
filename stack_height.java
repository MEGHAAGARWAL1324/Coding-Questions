package recursion;

public class stack_height {
	public static void main(String []args) {
		int x=2;
		int n=6;
		System.out.println(height(x,n));
	}
	public static int height(int x,int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
		int h=x*height(x,n-1);
		return h;
	}
}
