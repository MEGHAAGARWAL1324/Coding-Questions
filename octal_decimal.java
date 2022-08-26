import java.util.*;
public class octal_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Octal Number: ");
        int n=sc.nextInt();
        int temp=n;
        int dec=0;
        double i=0;
        while (n>0) {
            int rem=n%10;
            dec=dec+rem*((int) Math.pow(8, i));
            n=n/10;
            i++;
        }
        System.out.println("Decimal Number="+dec);
    }
}
