import java.util.*;

public class sort_array {
    public static void sort_arr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
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
        sort_arr(arr);
    }
}
