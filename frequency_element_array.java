import java.util.*;

public class frequency_element_array {
    public static void frqcy_el(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            System.out.println(arr[i] + ": " + count);
            count++;
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
        frqcy_el(arr);
    }
}
