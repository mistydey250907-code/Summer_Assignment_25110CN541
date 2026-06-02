import java.util.*;
import java.io.*;
public class binarytodecimal {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();
        int decimal=0;int N=n;
        int power=0;
        while(n>0){
            int lastdigit=n%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,power));
            power++;
            n=n/10;
        }
        System.out.println("binary to decimal of " + N + ":" + decimal);
    }
}
