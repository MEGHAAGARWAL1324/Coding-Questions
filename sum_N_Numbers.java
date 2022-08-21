import java.util.Scanner;

public class sum_N_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int count=0;
        for (int i = 1; i <= num; i++) {
            count=count+i;
        }
        System.out.println("Sum of First "+num+" Natural Number is "+ count);
    }
}
