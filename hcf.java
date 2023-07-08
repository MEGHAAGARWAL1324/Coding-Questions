package recursion;
import java.util.*;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		find_hcf(x,y);

	}
	public static void find_hcf(int x,int y) {
		if(x==0 ) {
			System.out.println(y);
			return;
		}
		if(y==0 ) {
			System.out.println(x);
			return;
		}
			if(x==y) {
				System.out.println(x);
				return;
			}
		
		if(x>y) {
			int a=x-y;
			find_hcf(a,y);
		}
		else {
			int a=y-x;
			find_hcf(x,a);
		}
	}

}
