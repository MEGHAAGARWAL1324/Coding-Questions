import java.util.*;

public class prime_number_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the staring number: ");
        int num1 = sc.nextInt();
        System.out.print("Total number which you want to print: ");
        int num2 = sc.nextInt();
        int count = 0;
        boolean flag;
        for (int i = num1; count != num2; i++) {
            flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }

        }
    }
}