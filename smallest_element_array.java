import java.util.*;
public class smallest_element_array {
    public static int  small_el(int arr[],int n) {
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min=arr[i];
            } 
        }
        return min;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Element: ");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Smallest Element in Array: "+small_el(arr,n));
    }
}
