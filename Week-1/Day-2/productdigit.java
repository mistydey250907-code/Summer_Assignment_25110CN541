import java.util.*;
import java.io.*;
public class productdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int p=1;
        while(n!=0)
        {
            p=p*(n%10);
            n/=10;
        }
        System.out.println("product of digits of the given no. is "+p);
    }
}
