import java.util.*;
import java.io.*;
public class power {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.s");
        int n=sc.nextInt();
        System.out.println("Enter power");
        int p=sc.nextInt(); 
        int ans=1;
        for(int i=1;i<=p;i++){
            ans=ans*n;
        }                   
        System.out.println(ans);
    }
}
