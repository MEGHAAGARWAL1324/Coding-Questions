import java.util.Scanner;

public class harshad_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int result = 0;
        while (n != 0) {
            int pick_last = n % 10;
            result = result + pick_last;
            n = n / 10;
        }
        if (n % result == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}