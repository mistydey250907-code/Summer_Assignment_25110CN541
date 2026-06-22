import java.util.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replaceAll("\\s", "");

        System.out.println("String after removing spaces:" + result);

        sc.close();
    }
}