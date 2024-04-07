import java.util.Scanner;

class Main {

    // Function to return minimum element using recursion
    public static int findMinRec(int A[], int n) {
        // If size = 0 means whole array has been traversed
        if (n == 1)
            return A[0];

        // Return the minimum between the last element and the minimum of the rest of the array
        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }

    // Driver code
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);

        // Input size of array
        int n = scan.nextInt();

        // Input array elements
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        // Function calling
        System.out.println(findMinRec(A, n));
    }
}
