import java.util.*;
public class symetric_el {
    public static void check_symetric(int arr[][],int x,int y) {
        for (int i = 0; i < x; i++) {
            for (int j = i+1; j < y; j++) {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println(arr[i][0] + ", " + arr[i][1]);
                } 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int n = sc.nextInt();
        int y=sc.nextInt();
        int[][]arr = new int[n][y];
        System.out.println("Enter Element: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        check_symetric(arr,n,y);
    }
}
