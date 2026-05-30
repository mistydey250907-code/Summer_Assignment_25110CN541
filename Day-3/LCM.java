import java.util.*;
import java.io.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no.s");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int t=0;int gcd=0;
         if(m==0||n==0)
            gcd =(m+n)-t;//greater no. of the given no.s
         if(m<0||n<0)
        {
            m=Math.abs(m);
            n=Math.abs(n);
        }
         t=(m>n)?n:m;
        for(int i=1;i<=t;i++)
        {
            if(m%i==0&&n%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("LCM of given no. is "+(m*n)/gcd);
}
}
