import java.util.Scanner;

public class greatest_two_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" is Greater");
        }
        else{
        System.out.println(num2+" is Greater");
        }
    }
}
