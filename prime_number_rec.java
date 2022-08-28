import java.util.Scanner;

public class prime_number_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();
    int i=2;
    if (prime(n,i)) {
        System.out.println("Number is Prime");
    } else {
        System.out.println("Number is not Prime");
    }
    }
    public static boolean prime(int n,int i) {
        if (n%i==0) {
            return false;
        }
if(i==n/2){
    return false;
}
        prime(n, i+1);
        return true;
    }
}
