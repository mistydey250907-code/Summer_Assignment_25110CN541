import java.util.*;

public class MiniLibrarySystem {
    static Scanner sc = new Scanner(System.in);
    static String[] titles;
    static String[] authors;
    static int size = 0;

    public static void main(String[] args) {
        System.out.print("Enter the maximum number of books the library can hold: ");
        int max = sc.nextInt();
        sc.nextLine();

        titles = new String[max];
        authors = new String[max];

        while (true) {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("0. View all books");
            System.out.println("1. Add a new book");
            System.out.println("2. Update book details");
            System.out.println("3. Search for a book");
            System.out.println("4. Remove a book");
            System.out.println("5. Stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    if (size == 0) {
                        System.out.println("The library is currently empty.");
                        break;
                    }
                    for (int i = 0; i < size; i++) {
                        System.out.println("Book Index: " + i + " | Title: " + titles[i] + " | Author: " + authors[i]);
                    }
                    break;
                }
                case 1: {
                    if (size >= titles.length) {
                        System.out.println("Library full");
                        break;
                    }
                    System.out.println("Enter book title:");
                    String title = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (titles[i].equalsIgnoreCase(title)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("This book title already exists in the library.");
                        break;
                    }

                    System.out.println("Enter author name:");
                    String author = sc.nextLine();

                    titles[size] = title;
                    authors[size] = author;
                    size++;
                    System.out.println("Book added successfully!");
                    break;
                }
                case 2: {
                    System.out.println("Enter the title of the book to update:");
                    String title = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (titles[i].equalsIgnoreCase(title)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Book title not found.");
                        break;
                    }

                    System.out.println("What field do you want to update?");
                    System.out.println("1. Title\n2. Author");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();

                    if (updateChoice == 1) {
                        System.out.println("Enter new Title:");
                        titles[foundIndex] = sc.nextLine();
                    } else if (updateChoice == 2) {
                        System.out.println("Enter new Author:");
                        authors[foundIndex] = sc.nextLine();
                    } else {
                        System.out.println("Invalid choice.");
                        break;
                    }
                    System.out.println("Book registry updated successfully!");
                    break;
                }
                case 3: {
                    System.out.println("Enter book title to search:");
                    String title = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (titles[i].equalsIgnoreCase(title)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Found! Book Index: " + foundIndex + " | Title: " + titles[foundIndex] + " | Author: " + authors[foundIndex]);
                    } else {
                        System.out.println("Book not found in library registry.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter book title to remove:");
                    String title = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (titles[i].equalsIgnoreCase(title)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Book title not found.");
                        break;
                    }

                    for (int i = foundIndex; i < size - 1; i++) {
                        titles[i] = titles[i + 1];
                        authors[i] = authors[i + 1];
                    }
                    size--;
                    System.out.println("Book removed ");
                    break;
                }
                case 5: {
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