import java.util.*;
import java.io.*;
public class palindrome {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.s");
        int n=sc.nextInt();
        int r=0;int N=n;
        while(n!=0)
        {
            r=r*10+(n%10);
            n/=10;
        }
        System.out.println(r);
        if(r==N)
            System.out.println(N+" is a palindrome no.");
        else
            System.out.println(N+" is not a palindrome no.");
     }
}
