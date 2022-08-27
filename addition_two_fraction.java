import java.util.Scanner;

public class addition_two_fraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numerator of 1st fraction: ");
        int n1=sc.nextInt();
        System.out.print("Enter numerator of 1st denominator: ");
        int d1=sc.nextInt();
        System.out.print("Enter numerator of 2nd fraction: ");
        int n2=sc.nextInt();
        System.out.print("Enter numerator of 2nd denominator: ");
        int d2=sc.nextInt();
int n,d,hcf=1;
        if(d1==d2){
n=n1+n2;
d=d1;
        }
        else{
            for (int i = 1; i <=d1 || i<=d2; i++) {
                if (d1%i==0 && d2%i==0) {
                    hcf=i;
                }
            }
                    int lcm=(d1*d2)/hcf;
                    d=lcm;
                    n=(lcm/d1)*n1+(lcm/d2)*n2;
                    }

                    System.out.println("Addition of two fraction: "+n+"/"+d);
    }
}
