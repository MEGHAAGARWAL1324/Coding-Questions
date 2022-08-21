import java.util.Scanner;

public class positive_and_negetive_number {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negetive");
        }
    }
}