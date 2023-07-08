package recursion;

public class sum_subset_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,2};
		sum_subset(arr,0,arr.length-1,0);

	}
	public static void sum_subset(int arr[],int l,int r,int sum) {
		if (l > r) {
            System.out.print(sum + " ");
            return;
        }
 
        sum_subset(arr, l + 1, r, sum + arr[l]);
 
        sum_subset(arr, l + 1, r, sum);
	}

}
