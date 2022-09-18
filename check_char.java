import java.util.*;
public class check_char {
    public static void check_character(char s) {
        if (s=='a' || s=='e' ||s=='i' ||s=='o' ||s=='u' ||s=='A' ||s=='E' ||s=='I' ||s=='O' ||s=='U') {
            System.out.println("Character is vowel");
        } else {
            System.out.println("Character is Consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
char s='b';
check_character(s);
    }
}
