import java.util.*;
public class findmissingno{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }
        //sorting
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }boolean flag=false;System.out.println("Missing elements:");
     for (int i = 0; i < n - 1; i++) {
         
            if (arr[i + 1] - arr[i] > 1) { flag=true;
                for(int j=arr[i]+1;j<arr[i+1];j++)
                {
                    System.out.println(j+" ");
                }
            }
        }
          if(flag==false)
        System.out.println("No missing number found.");
        sc.close();
    }
}
