  import java.util.*;
public class ArrangelStringBylength {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s1 = sc.nextLine();s1=s1.trim();s1=s1.replaceAll("\\s"," ");
        StringTokenizer token = new StringTokenizer(s1); int n=token.countTokens();
       String st[]=new String[n];int arr[]=new int[n];
         for(int i=0;i<n;i++)
        {
            st[i]=token.nextToken();
            arr[i]=st[i].length();
        }
            for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];String tem=st[j];
                    arr[j] = arr[j + 1]; st[j] = st[j + 1];
                    arr[j + 1] = temp;st[j + 1] = tem;
                }
            }
        }

        System.out.println("Sorted string(in ascending order):");
        for (int i = 0; i < n; i++) {
            System.out.print(st[i] + " ");
        }       
}
}
