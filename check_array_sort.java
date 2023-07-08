package recursion;

public class check_array_sort {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,5,6};
		
		System.out.println(sort(arr,0));
	}
	public static boolean sort(int arr[],int s) {
		if(s==arr.length-1) {
			return true;
		}
		if(arr[s]<arr[s+1]) {
		return sort(arr,s+1);
	}
		else {
		return false;
		}}

}
