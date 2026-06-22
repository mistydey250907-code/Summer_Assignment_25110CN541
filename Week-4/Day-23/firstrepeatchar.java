import java.util.*;
public class firstrepeatchar {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
         int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch]!= 1) {
             System.out.println("first repeating charater is "+ch);break;
    }
}
  sc.close();  }
}

