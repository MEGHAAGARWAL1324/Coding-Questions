import java.util.*;
public class mirrored_rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter no of cols: ");
        int col=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 4; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
