import java.util.Scanner;

public class perfect_square {

	static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {
		
			int sr = (int)Math.sqrt(x);
		
			return ((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x=sc.nextInt();

		if (isPerfectSquare(x))
			System.out.print("It is a Perfect Square");
		else
			System.out.print("It is not a Perfect Square");
	}
} 