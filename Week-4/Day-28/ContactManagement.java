import java.util.*;

public class ContactManagement {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, ContactInfo> map = new HashMap<>();

    static class ContactInfo {
        String name;
        long phone;
        String email;
        String group;

        ContactInfo(String name, long phone, String email, String group) {
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.group = group;
        }

        public String toString() {
            return "| Name: " + name + " | Phone: " + phone + " | Email: " + email + " | Group: " + group;
        }
    }

    public static void main(String[] args) {
        map.put(1, new ContactInfo("Adam Silvenia", 9234567890L, "adam@link.com", "Friends"));
        map.put(4, new ContactInfo("Cam Silvenia", 9232547890L, "cam@work.com", "Work"));
        map.put(2, new ContactInfo("Sierra Karinton", 9984562194L, "sierra@fam.com", "Family"));
        map.put(3, new ContactInfo("Rora Monabell", 9134167845L, "rora@link.com", "Friends"));

        while (true) {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("Enter 0 to print all contacts");
            System.out.println("Enter 1 to add a new contact");
            System.out.println("Enter 2 to update a contact");
            System.out.println("Enter 3 to find a contact");
            System.out.println("Enter 4 to remove a contact");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, ContactInfo> e : map.entrySet()) {
                        System.out.println("Contact ID: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addContact();
                    break;
                }
                case 2: {
                    updateContact();
                    break;
                }
                case 3: {
                    findContact();
                    break;
                }
                case 4: {
                    removeContact();
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

    public static void addContact() {
        System.out.println("Enter Contact ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Contact ID already exists.");
            return;
        }

        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter phone number:");
        long phone = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter group (Family/Friends/Work):");
        String group = sc.nextLine();

        map.put(id, new ContactInfo(name, phone, email, group));
        System.out.println("Contact added successfully!");
    }

    public static void removeContact() {
        System.out.println("Enter Contact ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Contact ID not found.");
            return;
        }
        map.remove(id);
        System.out.println("Contact removed successfully!");
    }

    public static void findContact() {
        System.out.println("Enter Contact ID to find:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Contact ID: " + id + " " + map.get(id));
        } else {
            System.out.println("Contact ID not found.");
        }
    }

    public static void updateContact() {
        System.out.println("Enter Contact ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Contact ID not found.");
            return;
        }

        ContactInfo contact = map.get(id);

        System.out.println("What do you want to update?");
        System.out.println("1. Name\n2. Phone Number\n3. Email\n4. Group");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Name:");
                contact.name = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Phone Number:");
                contact.phone = sc.nextLong();
                sc.nextLine();
                break;
            case 3:
                System.out.println("Enter new Email:");
                contact.email = sc.nextLine();
                break;
            case 4:
                System.out.println("Enter new Group:");
                contact.group = sc.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Contact updated successfully!");
    }
}