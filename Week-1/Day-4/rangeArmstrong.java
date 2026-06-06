import java.util.*;
import java.io.*;
public class rangeArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int r=sc.nextInt();
        int s=sc.nextInt();
        System.out.println("Armstrong numbers in the range are : ");
        for(int i=r;i<=s;i++){
        	int n = i;
            int N = n;
            int sum = 0;
            int c=0;
            while(n > 0) {
                    n /= 10;
                    c++;
                }
            n = N;
            while (n > 0) {
                int digit = n % 10;
                sum += Math.pow(digit, c);
                n /= 10;
            }
            if (sum == N) {
                System.out.println(N);
            } 
        }
    }
}