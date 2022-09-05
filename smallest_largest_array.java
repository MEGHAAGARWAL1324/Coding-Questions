import java.util.*;

public class smallest_largest_array {
    public static void small_lar(int arr[], int n) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);
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
        small_lar(arr, n);
    }
}
