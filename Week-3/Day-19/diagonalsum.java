import java.util.Scanner;
public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j ) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Total diagonal sum = " + sum);
    }
}