import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hcf=1;
        System.out.print("Enter Two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
for (int i = 1; i <=num1 || i<=num2; i++) {
    if (num1%i==0 && num2%i==0) {
        hcf=i;
    }
}
        int lcm=(num1*num2)/hcf;
        System.out.println("Lcm= "+lcm);
    }
}
