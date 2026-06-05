import java.util.*;
import java.io.*;
public class duplicate {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   
          }int h=0;
        System.out.println("the duplicate elements are:");
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
          {
                 if(arr[i]==arr[j])
                 {
                  System.out.print(arr[i]+" ");
                  h=1;
                  break;
                    } 
          }
                }
               
        }
     if(h!=1)
     {
      System.out.print("No duplicate is found");
     }
}
}
