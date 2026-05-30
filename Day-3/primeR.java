import java.util.*;
import java.io.*;
public class primeR {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range");
        int m=sc.nextInt();
        int n=sc.nextInt();
         int c=0;int t=0;
         System.out.println(" Between "+m+" & "+n+" prime no.s are ");
        for(int j=m;j<=n;j++)
        { c=0;
           for(int i=2;i<j;i++)
        {
            if(j%i==0)
                c++;
        }
        if(c==0&&j>1)
        {
             t=1;
            System.out.print(j+" ");
        }
        }
        if(t==0)
        {
            System.out.println(" NONE");
        }
}
        }
