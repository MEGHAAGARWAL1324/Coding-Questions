package recursion;

public class fibbonacci {
	public static void main(String []args) {
		int n=7;
		int f=0;
		int s=1;
		System.out.println(f);
		System.out.println(s);
		fib(n-2,f,s);
	}
	public static void fib(int n,int f,int s) {
		if(n==0) {
			return;
		}
		int c=f+s;
		System.out.println(c);
		fib(n-1,s,c);
	}
}
