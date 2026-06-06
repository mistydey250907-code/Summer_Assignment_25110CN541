import java.util.Scanner;
public class charpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=i;k<n;k++)
            {
                System.out.print(" ");
            } char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
            ch++;} ch-=2;
                for(int m=i-1;m>=1;m--)
                {
                    System.out.print(ch);
                    ch--;
                }
            System.out.println();
        }
}
}