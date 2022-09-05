import java.util.*;
public class second_smallest_array {
    public static void sec_small(int arr[]) {
        int sec_min=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
min=arr[i];
if(sec_min >arr[i] && arr[i]!=min){
    sec_min=arr[i];
}
            }
        }
        System.out.println("Second Smallest Element in: "+sec_min);
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sec_small(arr);
 }   
}
