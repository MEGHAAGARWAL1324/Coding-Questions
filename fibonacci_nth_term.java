import java.util.*;
class fibonaccii{
    public void find_fibonacci(int n){
        int arr[]=new int[n];
arr[0]=0;
arr[1]=1;
System.out.print(arr[0]+" "+arr[1]+" ");
for (int i = 2; i < n; i++) {
    arr[i]=arr[0]+arr[1];
    arr[0]=arr[1];
    arr[1]=arr[i];
    System.out.print(arr[i]+" ");
}

System.out.println("\nEnter the number of Nth term of Fibonacci series:");
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
System.out.println(arr[f]);
    }
}
public class fibonacci_nth_term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number: ");
int n=sc.nextInt();
fibonaccii f=new fibonaccii();
f.find_fibonacci(n);
    }
}
