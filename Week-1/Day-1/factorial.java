import java.io.*;
import java.util.*;
public class factorial
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("factorial of negative no. is undefined");
        else if(n==0)
            System.out.println("factorial of 0 is 1");
        else
        {
            int N=1;
        for(int i=1;i<=n;i++)
        {
           N*=i;
        }
        System.out.println("factorial of "+n+" is "+N);
    }
 }
 }