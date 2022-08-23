import java.util.*;
class armstrong{
    public void armstrong_check(int num){
        int rev=0;
        int temp=num;
        while (num!=0) {
            int rem=num%10;
            rev=rev+(rem*rem*rem);
            num=num/10;
        }
        if(temp==rev){
System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome ");
        }
    }

}
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
armstrong n=new armstrong();
n.armstrong_check(num);
    }
}
