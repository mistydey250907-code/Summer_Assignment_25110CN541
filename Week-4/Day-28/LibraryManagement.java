import java.util.*;

public class LibraryManagement {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, BookInfo> map = new HashMap<>();

    static class BookInfo {
        String title;
        String author;
        int copies;
        double price;

        BookInfo(String title, String author, int copies, double price) {
            this.title = title;
            this.author = author;
            this.copies = copies;
            this.price = price;
        }
        public String toString() {
            return "| Title: " + title + " | Author: " + author + " | Available Copies: " + copies + " | Price: Rs. " + price;
        }
    }

    public static void main(String[] args) {
        map.put(1001, new BookInfo("The Great Gatsby", "F. Scott Fitzgerald", 5, 450.0));
        map.put(1004, new BookInfo("To Kill a Mockingbird", "Harper Lee", 3, 550.0));
        map.put(1002, new BookInfo("1984", "George Orwell", 8, 350.0));
        map.put(1003, new BookInfo("Moby Dick", "Herman Melville", 2, 400.0));

        while (true) {
            System.out.println("Enter 0 to print all book records");
            System.out.println("Enter 1 to add a new book record");
            System.out.println("Enter 2 to update a book record");
            System.out.println("Enter 3 to find a book record");
            System.out.println("Enter 4 to remove a book record");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, BookInfo> e : map.entrySet()) {
                        System.out.println("Book ID: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addBook();
                    break;
                }
                case 2: {
                    updateBook();
                    break;
                }
                case 3: {
                    findBook();
                    break;
                }
                case 4: {
                    removeBook();
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

    public static void addBook() {
        System.out.println("Enter Book ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Book record already exists.");
            return;
        }

        System.out.println("Enter book title:");
        String title = sc.nextLine();
        System.out.println("Enter author name:");
        String author = sc.nextLine();
        System.out.println("Enter number of copies:");
        int copies = sc.nextInt();
        System.out.println("Enter price (in Rs):");
        double price = sc.nextDouble();
        sc.nextLine();

        map.put(id, new BookInfo(title, author, copies, price));
        System.out.println("Book record added successfully!");
    }

    public static void removeBook() {
        System.out.println("Enter Book ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Book ID not found.");
            return;
        }
        map.remove(id);
        System.out.println("Book record removed successfully!");
    }

    public static void findBook() {
        System.out.println("Enter Book ID to find:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Book ID: " + id + " " + map.get(id));
        } else {
            System.out.println("Book ID not found.");
        }
    }

    public static void updateBook() {
        System.out.println("Enter Book ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Book ID not found.");
            return;
        }

        BookInfo book = map.get(id);

        System.out.println("What do you want to update?");
        System.out.println("1. Title\n2. Author\n3. Copies\n4. Price");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Title:");
                book.title = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Author:");
                book.author = sc.nextLine();
                break;
            case 3:
                System.out.println("Enter new Available Copies:");
                book.copies = sc.nextInt();
                sc.nextLine();
                break;
            case 4:
                System.out.println("Enter new Price (in Rs):");
                book.price = sc.nextDouble();
                sc.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Book record updated");
    }
}