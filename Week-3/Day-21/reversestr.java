import java.util.*;
public class reversestr {
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string: ");
        String str = sc.nextLine();
StringBuilder sb= new StringBuilder(str);
 System.out.print("Reversed string is :"+sb.reverse());
 }
}