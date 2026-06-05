import java.util.*;
public class reversestr {
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int l=str.length();
        String s="";
        for(int i=l-1;i>=0;i--)
        {
                char ch=str.charAt(i);
                s=s+ch;
        }
        System.out.print("Reversed string is :"+s);
 }  
}
