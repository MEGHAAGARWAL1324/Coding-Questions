import java.util.Scanner;
class fibonacci{
public void find_fibonacci(int n){
    int first=0;
    int second=1;
    System.out.print(first+" "+second+" ");
    for (int i = 2; i < n; i++) {
    
    int fib=first+second;
    first=second;
    second=fib;
    System.out.print(fib+" ");
    }
}
}
public class fibonacci_series {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number: ");
int n=sc.nextInt();
fibonacci f=new fibonacci();
f.find_fibonacci(n);
}   
}
