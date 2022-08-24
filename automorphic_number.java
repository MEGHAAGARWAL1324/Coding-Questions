import java.util.Scanner;
class automorphic{
    public void number(int n) {
        int square=n*n;
        System.out.println("Square of the number is "+square);
        int rem=square%10;
        if(n==rem){
            System.out.println("It is a Automorphic Number");
        }
        else{
            System.out.println("It is not a Automorphic Number");
        }

    }
}

public class automorphic_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
automorphic a=new automorphic();
a.number(n);

    }
}
