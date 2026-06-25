import java.util.*;
public class StringAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of names");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the names : ");
       String names[]=new String[n];
         for(int i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
        }
        Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
        System.out.println(" After Sorting Alphabetically");
      for (int i=0;i<n;i++) {
            System.out.println(names[i]);
        }
        
    }
}
