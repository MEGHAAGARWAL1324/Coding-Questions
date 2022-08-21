import java.net.Socket;
import java.util.Scanner;

public class sum_given_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Starting Number: ");
        int start=sc.nextInt();
        System.out.print("Enter the Ending Number:");
        int end=sc.nextInt();
        int count=0;
        for (int i = start; i <= end; i++) {
            count=count+i;
        }
        System.out.println("Sum of numbers in a given range: "+count);
    }
}
