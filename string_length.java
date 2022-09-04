import java.util.Scanner;

public class string_length {
public static int str_len(String s) {
    if (s.equals(""))
            return 0;
        else
            return str_len(s.substring(1)) + 1;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        System.out.println(str_len(s));
    }
}
