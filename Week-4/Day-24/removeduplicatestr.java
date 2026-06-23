import java.util.*;
public class removeduplicatestr {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s1 = sc.nextLine();s1=s1.trim();s1=s1.replaceAll("\\s"," ");
        StringTokenizer token = new StringTokenizer(s1); int c=token.countTokens();
       int i=0;String st[]=new String[c];int c2=c;
       
         for(i=0;i<c2;i++)
        {
            st[i]=token.nextToken();
        }
       c2=c;
       System.out.println("array after removing the duplicate elements:");
        for(i=0;i<c2;i++)
        {
          boolean f=false;
          for(int k=0;k<i;k++)
          {
            if(st[i].compareTo(st[k])==0)
              f=true;
          }
          if(f==false){
         System.out.print(st[i]+" ");
                }
               
        }
}
}