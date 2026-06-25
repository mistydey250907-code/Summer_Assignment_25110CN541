import java.util.*;

public class commonchar1 {
    static int n; 
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of strings");
        n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the array of strings");
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        
        System.out.print("Common characters: ");
        common(s[0], s);
        System.out.println();
    }

    public static void common(String s, String str[]) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isCommonInAll = true;
            String[] tempStr = new String[str.length];
            for (int k = 0; k < str.length; k++) {
                tempStr[k] = str[k];
            }
            for (int j = 1; j < n; j++) {
                int index = tempStr[j].indexOf(ch);
                if (index != -1) {
                    // removes the charcter from the String
                    tempStr[j] = tempStr[j].substring(0, index) + tempStr[j].substring(index + 1);
                } else {
                    isCommonInAll = false;
                    break; 
                }
            }
            if (isCommonInAll) {
                System.out.print(ch + " ");
                // Update the real string array
                str = tempStr; 
            }
        }
    }
}