import java.util.*;
public class freqofelement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int c=0;
            System.out.println("Enter the no. whose frequency you want to find");
            int x=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(arr[i]==x)
                    c++;
            }
            System.out.println("Freuency of "+x+" is "+c);
            sc.close();
    }
}
