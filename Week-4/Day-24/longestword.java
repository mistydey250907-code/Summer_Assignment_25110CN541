import java.util.*;
public class longestword {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s1 = sc.nextLine();s1=s1.trim();s1=s1.replaceAll("\\s"," ");
        StringTokenizer token = new StringTokenizer(s1); int c=token.countTokens();
        int arr[] =new int [c];int i=0;String st[]=new String[c];int c2=c;
        while(c2!=0)
        {
            st[i]=token.nextToken();arr[i]=st[i].length();i++;c2--;
        }int max=-1;String s="";c--;
        while(c!=-1)
        {
            if(arr[c]>max)
        {
            max=arr[c];s=st[c];
        }c--;
        }
             System.out.println("Longest word is "+s);
        sc.close();
    }
}

