import java.util.*;
import java.io.*;

public class recursivereverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();
        int reversed=RecursiveReverse(n,0);
        System.out.println("Reverse of " + n + " is: " + reversed);
    }
   
    public static int RecursiveReverse(int d,int a) 
    {
        if(d!=0)
        {
        return RecursiveReverse(d/10,a*10+d%10);
}
else
    return a;
    }
}