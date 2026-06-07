import java.util.*;
import java.io.*;
public class recursivefactorial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        long factorial=RecursiveFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static long  RecursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * RecursiveFactorial(n - 1);
        }
    }
}
