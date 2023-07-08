package recursion;

public class Basic {
public static void main(String []args) {
	int n=1;
	num(n);
}
public static void num(int n) {
	if(n==6) {
		return;
	}
	System.out.println(n);
	
	num(n+1);
}
}
