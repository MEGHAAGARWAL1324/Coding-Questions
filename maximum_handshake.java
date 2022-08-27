import java.util.Scanner;

public class maximum_handshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number of Person in a Room: ");
        int n=sc.nextInt();
        int no_Of_handshake=n*(n-1)/2;
        System.out.println("Maximum Number Of Handshake: "+no_Of_handshake);
        }
}
