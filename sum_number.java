package recursion;

public class sum_number {
	public static void main(String []args) {
		int n=10;
		System.out.println(sum(n));
	}
	public static int  sum(int n) {
		if(n==1) {
			
			return 1;
		}
		int f=n+sum(n-1);
		return f;
		
	}
	
}
