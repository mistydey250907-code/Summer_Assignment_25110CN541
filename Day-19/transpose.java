    import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        int[][] T = new int[n][m];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                T[j][i] = A[i][j];
            }
        }
        System.out.println("Transpose of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}

