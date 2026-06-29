import java.util.*;

public class ArrayOperationsSystem {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = null;
    static int size = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== ARRAY OPERATIONS SYSTEM =====");
            System.out.println("1. Create / Initialize Array");
            System.out.println("2. Display Array");
            System.out.println("3. Insert Element at Specific Index");
            System.out.println("4. Delete Element from Specific Index");
            System.out.println("5. Search Element (Linear Search)");
            System.out.println("6. Stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the maximum capacity of the array: ");
                    int capacity = sc.nextInt();
                    arr = new int[capacity];
                    System.out.print("Enter the number of initial elements to add: ");
                    size = sc.nextInt();
                    
                    if (size > capacity) {
                        System.out.println("Initial elements cannot exceed max capacity! Setting size to 0.");
                        size = 0;
                        break;
                    }
                    
                    System.out.println("Enter " + size + " elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }
                    sc.nextLine();
                    System.out.println("Array initialized successfully!");
                    break;
                }
                case 2: {
                    if (arr == null || size == 0) {
                        System.out.println("Array is empty or uninitialized.");
                        break;
                    }
                    System.out.print("Current Array Elements: [ ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("]");
                    break;
                }
                case 3: {
                    if (arr == null) {
                        System.out.println("Initialize array first!");
                        break;
                    }
                    if (size >= arr.length) {
                        System.out.println("Array Overflow! Cannot insert more items.");
                        break;
                    }
                    System.out.print("Enter the index where you want to insert (0 to " + size + "): ");
                    int index = sc.nextInt();
                    System.out.print("Enter the element value to insert: ");
                    int value = sc.nextInt();
                    sc.nextLine();

                    if (index < 0 || index > size) {
                        System.out.println("Invalid index position.");
                        break;
                    }

                    for (int i = size; i > index; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[index] = value;
                    size++;
                    System.out.println("Element inserted successfully!");
                    break;
                }
                case 4: {
                    if (arr == null || size == 0) {
                        System.out.println("Array Underflow! No elements present to delete.");
                        break;
                    }
                    System.out.print("Enter the index to delete from (0 to " + (size - 1) + "): ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index < 0 || index >= size) {
                        System.out.println("Invalid index position.");
                        break;
                    }

                    System.out.println("Deleted element: " + arr[index]);
                    for (int i = index; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    size--;
                    System.out.println("Element removed and array shifted successfully!");
                    break;
                }
                case 5: {
                    if (arr == null || size == 0) {
                        System.out.println("Array is empty. Nothing to search.");
                        break;
                    }
                    System.out.print("Enter the element value to search for: ");
                    int target = sc.nextInt();
                    sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == target) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Element found at Index location: " + foundIndex);
                    } else {
                        System.out.println("Element not found within the array scope.");
                    }
                    break;
                }
                case 6: {
                    return;
                }
                default: {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }
}