public class smallest_array {
    public static int findMinimum(int A[], int n) {

        if (n == 1)
            return A[0];

        return Math.min(A[n - 1], findMinimum(A, n - 1));
    }

    public static void main(String args[]) {
        int A[] = { 15, 60, -6, 0, 2 };
        int n = A.length;
        // Function calling
        System.out.println("Smallest element in the array is: " + findMinimum(A, n));
    }
}