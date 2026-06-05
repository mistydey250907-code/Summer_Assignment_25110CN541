import java.util.*;

public class rotateleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }int t=0;
        System.out.println("Enter the no. of times you want to rotate the array left not more than the size of array");
        int s=sc.nextInt();
        int ar[]=new int[n];
        for(int i=s;i<s+n;i++)
        {
            if(i<n)
            ar[t]=arr[i];
        else
            ar[t]=arr[i-n];
            t++;
        }
        System.out.println("Array rotated left by "+s+" :");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]+" ");
        }
}
}