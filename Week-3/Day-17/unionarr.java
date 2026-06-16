import java.util.Scanner;

public class unionarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int m = sc.nextInt();
        System.out.print("Enter number of elements in second array: ");
        int n = sc.nextInt();
        int[]arr = new int[m];
        int[] ar = new int[n];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            int c=0;
        System.out.println("Enter elements of second matrix:");
            for (int j = 0; j < n; j++) {boolean flag=false;
              int t=sc.nextInt();
              for(int i=0;i<m;i++)
              {
                 if(arr[i]==t)
                    flag =true;
              }
              if(flag ==false)
              {
                ar[c]=t;c++;
             }
          }
          System.out.println("Union of given arrays :");
          for(int j=0;j<m+c;j++)
          {if(j<m){
            boolean flag=false;
              for(int i=0;i<j;i++)
              {
                 if(arr[i]==arr[j])
                    flag =true;
              }
              if(flag ==false)
              {
                System.out.print(arr[j]+" ");
             }
          }else
          {
            boolean flag=false;
              for(int i=0;i<(j-m);i++)
              {
                 if(ar[i]==ar[j-m])
                    flag =true;
              }
              if(flag ==false)
              {
          System.out.print(ar[j-m]+" ");
        }
    }
        } 
    }
}
