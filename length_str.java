import java.util.*;

public class length_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int i=0;
        for (char str : s.toCharArray()) {
            i++;
        }
        System.out.println(i);
    }
}
