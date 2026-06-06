import java.util.*;
import java.io.*;
public class largestprimefactor {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();   
        int lpf=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                int c=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        c++;
                }
                if(c==0)
                    lpf=i;
            }
        }
        System.out.println("Largest prime factor of "+n+" is "+lpf);
    }
}
