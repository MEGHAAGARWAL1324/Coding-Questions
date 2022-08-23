import java.util.Scanner;
class factorial{
int f=1;
public void fact(int num) {
    for (int i = 1; i <= num; i++) {
        f=f*i;

        }
        System.out.println("The Factorial of a number is: "+f);
}
}
public class factorial_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
factorial f=new factorial();
f.fact(num);
    }
}
