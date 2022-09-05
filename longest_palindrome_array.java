import java.util.*;
public class longest_palindrome_array {
    public static void palindrome(int arr[]) {
        palindrome_check()
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
        palindrome(arr);
}    
}