import java.util.*;
import java.io.*;
public class prime {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==0&&n>1)
        {
            System.out.println(n+" is a prime no.");
        }
        else
    
System.out.println(n+" is not a prime no.");
        }
}
