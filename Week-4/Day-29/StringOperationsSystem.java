import java.util.*;

public class StringOperationsSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter 1 for String Concatenation");
            System.out.println("Enter 2 for String Palindrome Check");
            System.out.println("Enter 3 for Substring Extraction");
            System.out.println("Enter 4 for Vowel and Consonant Count");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter first string:");
                    String str1 = sc.nextLine();
                    System.out.println("Enter second string:");
                    String str2 = sc.nextLine();
                    System.out.println("Result: " + str1.concat(str2));
                    break;
                }
                case 2: {
                    System.out.println("Enter string to check:");
                    String str = sc.nextLine();
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(rev)) {
                        System.out.println("The string is a Palindrome.");
                    } else {
                        System.out.println("The string is NOT a Palindrome.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter main string:");
                    String str = sc.nextLine();
                    System.out.println("Enter starting index:");
                    int start = sc.nextInt();
                    System.out.println("Enter ending index:");
                    int end = sc.nextInt();
                    sc.nextLine();
                    if (start >= 0 && end <= str.length() && start <= end) {
                        System.out.println("Extracted Substring: " + str.substring(start, end));
                    } else {
                        System.out.println("Invalid indices provided.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter string:");
                    String str = sc.nextLine().toLowerCase();
                    int vowels = 0, consonants = 0;
                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);
                        if (ch >= 'a' && ch <= 'z') {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vowels++;
                            } else {
                                consonants++;
                            }
                        }
                    }
                    System.out.println("Vowels count: " + vowels);
                    System.out.println("Consonants count: " + consonants);
                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }
}