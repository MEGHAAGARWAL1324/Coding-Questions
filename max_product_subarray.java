import java.util.*;
public class max_product_subarray {
    public static void max_product(int arr[],int n) {
        int res=arr[0];
        
        for (int i = 0; i < n; i++) {
            int mul=arr[i];
            for (int j = i+1; j < n; j++) {
                mul=mul*arr[j];
            }
            res= Math.max(res, mul);
            }
        System.out.println(res);
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
        max_product(arr,n);
 }   
}
