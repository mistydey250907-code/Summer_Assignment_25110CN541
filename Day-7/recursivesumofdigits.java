import java.util.*;
import java.io.*;
public class recursivesumofdigits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        int sum=recursiveSumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);    
    }
    public static int recursiveSumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + recursiveSumOfDigits(n / 10);
        }
    }
}
