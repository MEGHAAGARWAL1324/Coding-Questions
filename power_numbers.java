import java.util.Scanner;

public class power_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Base:- ");
        int base=sc.nextInt();
        System.out.print("Enter Power:- ");
        int Power=sc.nextInt();
        int n=printnumber(base,Power);
        System.out.println("Power of a number: "+n);
        
    }
    public static int printnumber(int base,int power) {
        if(power==0){
            return 1;
        }
        return (base*printnumber(base, power-1));
    }
}
