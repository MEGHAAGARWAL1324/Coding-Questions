import java.util.Scanner;

public class largest_element_array {
public static int lar_el(int arr[],int n) {
    int max=arr[0];
    for (int i = 0; i < n; i++) {
        if (arr[i]>max) {
            max=arr[i];
        } 
    }
    return max;
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
        System.out.println("Largest Element in Array: "+lar_el(arr,n));

    }
}
