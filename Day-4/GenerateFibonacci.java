import java.util.*;
import java.io.*;
public class GenerateFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the terms: ");
        int n = sc.nextInt();int next=0;
        int first = 0, second = 1;
        System.out.print("The "+n+"th Term in the Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        System.out.print(first);
    }
}
