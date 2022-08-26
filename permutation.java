import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number of People in classroom: ");
        int n=sc.nextInt();
        System.out.print("Enter a Occupy seat in a classroom: ");
        int r=sc.nextInt();
 
 int number=(n-r);
 int permutation=fact(n)/fact(number);
 System.out.println("Total Possible arrangement= "+permutation);

        
    }
    public static int fact(int num) {
        int f=1;
        for (int i = 1; i <= num; i++) {
            f=f*i;
        }
        return f;
    }
}
