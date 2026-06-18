import java.util.Scanner;

public class substractmatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        System.out.println("Enter elements of first matrix(A):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix B:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Difference of matrices (A - B):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((A[i][j] - B[i][j]) + " ");
            }
            System.out.println();
        }
    }
}


