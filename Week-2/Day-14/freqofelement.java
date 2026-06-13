import java.util.*;
public class freqofelement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String n = sc.nextLine();n=n.trim();
        n=n.replaceAll("\\s"," ");
        StringTokenizer ob=new StringTokenizer(n);
        int c1=ob.countTokens();String arr[]=new String[c1];
        for(int i=0;i<c1;i++)
        {
            arr[i]=ob.nextToken();
        }int c=0;
            System.out.println("Enter the no. whose frequency you want to find");
            String x=sc.nextLine();
            for(int i=0;i<c1;i++)
            {
                if(arr[i].equalsIgnoreCase(x))
                    c++;
            }
            System.out.println("Freuency of "+x+" is "+c);
            sc.close();
    }
}
