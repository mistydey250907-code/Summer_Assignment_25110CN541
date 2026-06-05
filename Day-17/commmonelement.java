import java.util.Scanner;

public class commmonelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int m = sc.nextInt();
        System.out.print("Enter number of elements in second array: ");
        int n = sc.nextInt();
        int[]arr = new int[m];int c1=0;
        int[] ar = new int[n];
        System.out.println("Enter elements of first matrix:");
            for(int j=0;j<m;j++)
            {int t=arr[j]=sc.nextInt();
            boolean flag=false;
              for(int i=0;i<j;i++)
              {
                 if(arr[i]==arr[j])
                    flag =true;
              }
              if(flag ==false)
              {
                arr[c1] = arr[j];c1++;
                
              }
            }
            int c=0;
        System.out.println("Enter elements of second matrix:");
            for (int j = 0; j < n; j++) { boolean flag=false;int t=ar[j]=sc.nextInt();
              for(int i=0;i<j;i++)
              {
                 if(ar[i]==ar[j])
                    flag =true;
              }
              if(flag ==false)
              {
                ar[c] = t;c++;
              }
          }boolean flag=false;
          System.out.println("common elements of given arrays:");
          for(int i=0;i<c1;i++)
          {
          for(int j=0;j<c;j++)
          {
             if(arr[i]==ar[j])
               { System.out.print(arr[i]+" ");flag=true;}
          }
        }
           if(flag==false)
            System.out.println("No common element");
}
}
