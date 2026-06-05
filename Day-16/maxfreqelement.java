import java.util.*;
public class maxfreqelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  }
            int ar[]=new int[n];int c=0;
            for(int i=0;i<n;i++)
            {
                c=0;
                  boolean f=false;
          for(int k=0;k<i;k++)
          {
            if(arr[i]==arr[k])
              f=true;
          }
          if(f==false){
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                        c++;
                }
                ar[i]=c+1;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ar[j] < ar[j + 1]) {
                    int temp = arr[j];int tem=ar[j];
                    arr[j] = arr[j + 1];ar[j] = ar[j + 1];
                    ar[j + 1] = tem;
                    arr[j + 1] = temp;
                }
            }
        }
            System.out.println("Frequency of "+arr[0]+" is maximum"+"("+ar[0]+")");
        }
    }

