import java.util.Scanner;


public class f_n_term {
    public static int meth(int n,int x){
        if(x==n){
            return 0;
        }
        
        return meth(n, x);

    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a Number: ");   
     int n=sc.nextInt();
     meth(n,1);

    }
}
