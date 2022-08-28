import java.util.Scanner;

public class largest_array {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number of Array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    int i=0;
   
    System.out.println(largest_num(arr,i));

}
public static int largest_num(int arr[],int i) {
    
    int lar=arr[i];
for (int j = 0; j < arr.length+1; j++) {
    if(arr[i]>arr[j]){
        lar=arr[i];
    }
    else lar=arr[j];
}
if(i==arr.length){
    return lar;
}


return largest_num(arr, i+1);
    
}   
}
