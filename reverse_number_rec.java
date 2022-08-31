import java.util.Scanner;

public class reverse_number_rec {
public static void reverse(int num){
    if(num==0){
        return;
    }
System.out.print(num%10);
reverse(num/10);
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num=sc.nextInt();
reverse(num);
 }   
}
