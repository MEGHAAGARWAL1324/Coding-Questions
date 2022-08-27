import java.util.Scanner;

public class count_day_inmonth {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Month and Year: ");
    int month=sc.nextInt();
    int Year=sc.nextInt();

    if ((month==2) && ((Year%4==0) ||(Year%100==0) &&(Year%400==0))) {
        System.out.println("Number Of days: 29");
    }
    else if(month==2){
        System.out.println("Number Of days: 28");
    }
    else if (month==1 || month==3 || month==5 ||month==7 ||month==8 ||month==10 ||month==12) {
        System.out.println("Number Of days: 31");
    }
    else{
        System.out.println("Number Of days: 30");
    }
 }   
}
