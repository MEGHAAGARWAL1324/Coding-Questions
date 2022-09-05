import java.util.*;
public class sum_element_array {
    public static void sum(int arr[]){
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            s=s+arr[i];
        }
        System.out.println("Sum Of Element: "+s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }
}
