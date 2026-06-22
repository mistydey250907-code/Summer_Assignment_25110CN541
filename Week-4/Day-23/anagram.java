import java.util.*;
public class anagram {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st string: ");
        String str = sc.nextLine();
         System.out.println("Enter the 2nd string: ");
        String st = sc.nextLine();
        str=str.toLowerCase();
        st=st.toLowerCase(); str = str.replaceAll("[^a-z]", "");
        st = st.replaceAll("[^a-z]", "");
         int[] frequency = new int[26]; int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch-'a']++;
        }
          for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            freq[ch-'a']++;
        }boolean flag=false;
        for (int i = 0; i < 26; i++) {
           // char ch = str.charAt(i);char c=st.charAt(i);
            if (frequency[i]!=freq[i]) {
             flag=true; break;
    }
}
if(flag==true)
{
    System.out.println("Not an anagram");
}
else
{ System.out.println(" an anagram");}
  sc.close();  }
}