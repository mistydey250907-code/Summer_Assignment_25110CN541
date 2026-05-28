import java.util.*;
import java.io.*;
public class sum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a natural no.");
        int n=sc.nextInt();
        int N=n;
        if(n<=0)
        {
            System.out.println("not a natural no.");
        }
        else 
        {
            int sum=0;
            while(n>=1)
            {
              sum+=n;
              n--;
            }
            System.out.println("sum of upto "+N+" natural no. is "+sum);
        }
            }
}
