import java.util.*;
import java.io.*;
public class sumdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum+=(n%10);
            n/=10;
        }
        System.out.println("sum of the digits of the given no. is "+sum);
    }
}
