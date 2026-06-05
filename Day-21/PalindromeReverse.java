import java.util.Scanner;

public class PalindromeReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String lowerStr = str.toLowerCase();
        
        String reversed = "";
        for (int i = lowerStr.length() - 1; i >= 0; i--) {
            reversed = reversed + lowerStr.charAt(i); 
        }
        if (lowerStr.equals(reversed)) {
            System.out.println('"' + str + "\" is a palindrome.");
        } else {
            System.out.println('"' + str+ "\" is not a palindrome.");
        }

        sc.close();
    }
}