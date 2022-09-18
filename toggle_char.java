import java.util.*;
public class toggle_char {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                s.toLowerCase();
            } else {
                s.toUpperCase();
            }
        }
        System.out.println(s);
 }   
}
