import java.util.Scanner;

public class power_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of a number: ");
    int base=sc.nextInt();
    System.out.println("Enter the Exponent of a number: ");
    int expo=sc.nextInt();
    System.out.println(base+"^"+expo+"= "+(Math.pow(base, expo)));
    }
}
