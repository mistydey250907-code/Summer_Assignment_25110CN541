import java.util.*;
public class stringrotation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1st string");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String s2=sc.nextLine();
        if(s2.length()!=s1.length())
        {
            System.out.println("2nd string is not a rotated 1st string");
        }
        else
        {
            String temp=s1;boolean flag=false;
            for(int i=0;i<s1.length();i++)
            {String t1=""; 
                  t1=temp.substring(i)+temp.substring(0,i);
                  if(t1.equals(s2))
                  {flag=true;
                    System.out.println("2nd string is a rotated 1st string");
                    break;
                  }
            }
            if(flag==false)
            {
                System.out.println("2nd string is not a rotated 1st string");
            }
        }
        sc.close();
    }
}
