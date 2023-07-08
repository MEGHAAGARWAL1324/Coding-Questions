package recursion;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9;
if(check_prime(n,2)==0) {
	System.out.print("Prime Number");
}
else {
	System.out.print("Not a Prime Number");
}
	}
	public static int check_prime(int n,int i) {
		if(n==i){
			return 0;
		}
		else if(n%i==0) {
			return 1;
		}
		else
			return check_prime(n,i+1);
	}

}
