import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Create an array to store frequencies of all 256 ASCII characters
        int[] frequency = new int[256];

        // 2. Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++; // Increments the count at the character's ASCII value index
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] != 0) {
                System.out.println("'" + ch + "' comes " + frequency[ch] + " times");
                frequency[ch] = 0;
            }
        }

        sc.close();
    }
}