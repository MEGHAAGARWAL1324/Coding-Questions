import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter two Number: ");
       int num1=sc.nextInt(); 
       int num2=sc.nextInt();
       
       while (num1!=num2) {
        if(num1>num2){
            num1=num1-num2;
        }
        else{
            num2=num2-num1;
        }
       }
       System.out.println("HCF of the number: "+num1);
    }
}