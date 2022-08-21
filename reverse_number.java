import java.util.Scanner;
class r_number{
public void reverse(int num){
    int rev=0;
    while (num!=0) {
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
    }
    System.out.println("The Reverse number is "+rev);
}
}
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
r_number n=new r_number();
n.reverse(num);
    }
}
