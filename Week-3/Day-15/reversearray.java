import java.util.*;
public class reversearray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int t=0;
        int ar[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            ar[t]=arr[i];
            t++;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]+" ");
        }
}
}