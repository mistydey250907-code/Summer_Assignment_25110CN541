    import java.util.*;
public class removeduplicate {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   
          }
        System.out.println("array after removing the duplicate elements:");
        for(int i=0;i<n;i++)
        {
          boolean f=false;
          for(int k=0;k<i;k++)
          {
            if(arr[i]==arr[k])
              f=true;
          }
          if(f==false){
        inner:  for(int j=i+1;j<=n;j++)
          {
            if(j==n)
            {
              System.out.print(arr[i]+" ");
              break inner;
            }
                 if(arr[i]!=arr[j]){
                    System.out.print(arr[i]+" ");
                      break inner;}
          }
          
                }
               
        }
}
}


