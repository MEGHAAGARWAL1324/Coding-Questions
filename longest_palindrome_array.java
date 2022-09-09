import java.util.*;

public class longest_palindrome_array {
    static void sort_arr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static boolean isPalindrome(int arr) {
        int p = 0;
        while (arr != 0) {
                int rem = arr % 10;
                p = p * 10 + rem;
                arr = arr/ 10;
            }
        return true;
        }
    

    static void long_palindrome(int[] arr) {
        int res = -1;
        int i;
        for ( i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                res = arr[i];
            }
        }
        System.out.println("Longest Palindrome: " + res);
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
        long_palindrome(arr);
    }
}