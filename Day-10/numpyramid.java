import java.util.Scanner;
public class numpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=i;k<n;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);}
                for(int m=i-1;m>=1;m--)
                {
                    System.out.print(m);
                }
            System.out.println();
        }
}
}

