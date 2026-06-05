import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int wordCount = tokenizer.countTokens();

        System.out.println("Total number of words: " + wordCount);
        
        sc.close();
    }
}