import java.util.*;
public class compressString {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();String ch="";int l=s.length();
       // int i=0;
         while(!s.isEmpty())
          { ch=s.substring(0,1);
            System.out.print(ch);
        frequency(s,s.charAt(0));
        s=s.replaceAll(ch,"");
          }
    }
    public static void frequency(String str,char ch)
    {
          int c=0;
          for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)==ch)
            {
                c++;
            }
          }
          System.out.print(c);
    }
}
