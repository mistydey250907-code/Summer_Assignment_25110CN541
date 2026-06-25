import java.util.*;
public class mergesortedarr {
    public static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n]; // Array to store the result
        
        int i = 0; 
        int j = 0; 
        int k = 0; 
        // from both arrays copy the smaller element
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // If there are remaining elements in arr1, copy them
        while (i < m) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        
        // If there are remaining elements in arr2, copy them
        while (j < n) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        
        return merged;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }int[] result = merge(arr1, arr2);
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}