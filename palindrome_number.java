import java.util.*;

class palindrome {
    public void palindrome_check(int num) {
        int rev=0;
        int temp=num;
        while (num!=0) {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not a Palindrome");
        }


    }

}

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        palindrome p = new palindrome();
        p.palindrome_check(num);
    }
}
