import java.util.*;
public class count_even_odd {
    public static void count(int arr[]) {
        int odd=0;
        int even=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total Even Number="+even);
        System.out.println("Total Odd Number="+odd);
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
        count(arr);
    }
}
