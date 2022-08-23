import java.util.*;
class prime{
public void check_prime(int num){
    if(num<2){
        System.out.println(num+" is not a Prime Number");
    }
    int count=0;
    for (int i = 2; i <=num/i; i++) {
        if(num%i==0){
            count++;
        }
        
    }
    if(count>=1){
System.out.println("Not a Prime Number");
    }
    else{
        System.out.println("Prime Number");
    }

}
}
public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int num=sc.nextInt();
        prime p=new prime();
        p.check_prime(num);
    }
}
