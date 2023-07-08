package recursion;

import java.util.Scanner;

public class reverse {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int n=sc.nextInt();
	rev_num(n,0);
}
public static void rev_num(int n,int r) {
	if(n==0) {
		System.out.print(r);
		return;
	}
	int rem=n%10;
	r=r*10+rem;
	rev_num(n/10,r);
}
}
