import java.util.*;
public class abundant_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while (n!=0) {
            int rem=n%10;
            rev=rev+fact(rem);
            n=n/10;
        }
        if(rev>temp){
            System.out.println("It is a Abundant Number");
        }
        else{
            System.out.println("It is not a Abundant Number");
        }
    }

    private static int fact(int rem) {
        int f=1;
        for (int i = 1; i <= rem; i++) {
            f=f*i;
            }
        return f;
    }
}
