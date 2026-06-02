import java.util.*;
import java.io.*;
public class countsetbits {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();int N=n;
        int count=0;
        while(n>0){ 
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println("count of set bits in " + N + ":" + count);
    }
}
