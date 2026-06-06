import java.util.*;
import java.io.*;
public class perfect {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)                
        {
            if(n%i==0)
                sum=sum+i;
        }               
        if(sum==n)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
