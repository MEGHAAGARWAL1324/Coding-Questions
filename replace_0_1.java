import java.util.Scanner;

public class replace_0_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
String str=Integer.toString(n);
String s="";
for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i)=='0') {
        s=s+'1';
    }
    else{
        s=s+str.charAt(i);
    }
}
System.out.println("converted Number is: "+s);
        
    }
}
