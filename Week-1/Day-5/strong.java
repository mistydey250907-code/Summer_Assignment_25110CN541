import java.util.*;
import java.io.*;
public class strong {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;     
        while(temp>0)
        {
            int r=temp%10;
            int f=1;
            for(int i=1;i<=r;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            temp=temp/10;
        }
        if(sum==n)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }
}
