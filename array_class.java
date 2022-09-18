import java.util.*;
public class array_class {
    public static void main(String[] args) {
        int arr[]={1,5,7,2,9};
System.out.println(Arrays.asList(arr));
int key=7;
System.out.println(Arrays.binarySearch(arr, key));
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
    }
}
