package recursion;
import java.util.*;
public class largest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total no of Element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		find_largest(arr,n);

	}
	public static void find_largest(int arr[],int n) {
		int max=arr[0];
		for(int i=1;i<n-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
	System.out.println(max);
	
	}

}
