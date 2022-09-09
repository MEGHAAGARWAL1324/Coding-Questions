import java.util.*;
public class Scalar_product {
    public static void sort_asd(int arr[]) {
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
    public static void sort_dsd(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int []arr2=new int[n];
        System.out.println("Enter Element of 1st Array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Element of 2nd Array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sort_asd(arr1);
        sort_dsd(arr2);
        int s=0;
        for (int i = 0; i < arr2.length; i++) {
            s=s+(arr1[i]*arr2[i]);
        }
System.out.println(s);
    }
}
