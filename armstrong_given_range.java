import java.util.*;

public class armstrong_given_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Ending Number: ");
        int num2 = sc.nextInt();

        for (int i = num1; i < num2; i++) {
            int rev = 0;
            int temp = i;
            while (temp != 0) {
                int rem = temp % 10;
                rev = rev + (rem * rem * rem);
                temp = temp / 10;
            }
            if (rev == i) {
                System.out.println(i + " ");
            }
        }
    }
}
