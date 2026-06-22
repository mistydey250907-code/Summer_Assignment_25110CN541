import java.util.*;
public class maxoccuringchar {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }String ch="";int max=-1;
        int ascii=-1;
      for (int i=0;i<256;i++)
      { 
        if(frequency[i]>max)
        {
            max=frequency[i];
            ascii=i;
        }
        }ch=Character.toString(ascii);
        System.out.println("Maximum occuring charcter is " +ch);
        sc.close();
    }
}