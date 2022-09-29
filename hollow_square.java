import java.util.*;
public class hollow_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter no of cols: ");
        int col=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if((j==0 ||j==row-1) ||(i==0 ||i==col-1)){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
