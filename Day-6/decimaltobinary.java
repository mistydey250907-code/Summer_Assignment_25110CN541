import java.util.*;
import java.io.*;
public class decimaltobinary {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();  int N=n; 
        String binary="";
        while(n>0){
            int rem=n%2;
            binary=rem+binary;
            n=n/2;
        }
        System.out.println("decimal to binary of " + N + ":" + binary);
    }
}
