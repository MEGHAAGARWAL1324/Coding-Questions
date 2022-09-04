import java.util.*;
public class LCM_rec {
    public static int lcm(int num1,int num2) {
        if(num1==num2){
            return num1;
        }
        
        if(num1>num2){
        return (lcm(num1-num2, num2));
        }
        else{
            return (lcm(num1, num2-num1));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
System.out.print("Lcm= ");
        System.out.println((num1*num2)/lcm(num1,num2)); 
    }
}
