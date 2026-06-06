import java.util.*;
import java.io.*;
public class count {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();
        int i=0;int no=n;
        while(n!=0)
        {
            n/=10;
            i++;
        }
        System.out.println("no. of digits in "+no+" is "+i);
    }
}
