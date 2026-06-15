import java.util.*;
public class zeroestoend {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ar[]=new int[n];int t=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                ar[t]=arr[i];
                t++;
            } 
        }
        System.out.println("array after all the zeroes are shifted to end");
         for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
