import java.util.*;
public class givenpairsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  }
            System.out.println("enter a no.");
            int s=sc.nextInt();
            System.out.println("Pair with the sum equal to the "+s+" are:");
            for(int i=0;i<n;i++)
            {
                boolean f=false;
          for(int k=0;k<i;k++)
          {
            if(arr[i]==arr[k])
              f=true;
          }
          if(f==false){
             for(int j=i+1;j<n;j++)
               {boolean f1=false;
                 for(int k=0;k<j;k++)
          {
            if(arr[j]==arr[k])
              f1=true;
          }
          if(f1==false){
                   if((arr[i]+arr[j])==s)
                    System.out.println(arr[i]+","+arr[j]);
               }
            }
}
    }
}
}
