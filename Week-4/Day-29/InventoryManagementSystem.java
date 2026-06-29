import java.util.*;

public class InventoryManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, ItemInfo> map = new HashMap<>();

    static class ItemInfo {
        String itemName;
        int quantity;
        double price;

        ItemInfo(String itemName, int quantity, double price) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }
        public String toString() {
            return "| Item Name: " + itemName + " | Quantity: " + quantity + " | Price per Unit: Rs. " + price + " | Total Value: Rs. " + (quantity * price);
        }
    }

    public static void main(String[] args) {
        map.put(501, new ItemInfo("Logitech Mouse", 120, 850.0));
        map.put(504, new ItemInfo("Mechanical Keyboard", 45, 2500.0));
        map.put(502, new ItemInfo("Dell 24\" Monitor", 15, 12000.0));
        map.put(503, new ItemInfo("HDMI Cable 1.5m", 300, 350.0));

        while (true) {
            System.out.println("Enter 0 to print current inventory stock list");
            System.out.println("Enter 1 to add a new item to inventory");
            System.out.println("Enter 2 to update stock quantity or pricing");
            System.out.println("Enter 3 to search item by ID");
            System.out.println("Enter 4 to remove an item from inventory");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, ItemInfo> e : map.entrySet()) {
                        System.out.println("Item ID: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addItem();
                    break;
                }
                case 2: {
                    updateItem();
                    break;
                }
                case 3: {
                    findItem();
                    break;
                }
                case 4: {
                    removeItem();
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

    public static void addItem() {
        System.out.println("Enter Item ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Item ID already exists in inventory.");
            return;
        }

        System.out.println("Enter item name:");
        String name = sc.nextLine();
        System.out.println("Enter initial stock quantity:");
        int qty = sc.nextInt();
        System.out.println("Enter price per unit (in Rs):");
        double prc = sc.nextDouble();
        sc.nextLine();

        map.put(id, new ItemInfo(name, qty, prc));
        System.out.println("Inventory item added ");
    }

    public static void removeItem() {
        System.out.println("Enter Item ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Item ID not found.");
            return;
        }
        map.remove(id);
        System.out.println("Item removed from inventory system.");
    }

    public static void findItem() {
        System.out.println("Enter Item ID to check stock:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Item ID: " + id + " " + map.get(id));
        } else {
            System.out.println("Item ID not found.");
        }
    }

    public static void updateItem() {
        System.out.println("Enter Item ID to update details:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Item ID not found.");
            return;
        }

        ItemInfo item = map.get(id);

        System.out.println("What do you want to update?");
        System.out.println("1. Item Name\n2. Update Stock Quantity\n3. Restock (Add to current quantity)\n4. Unit Price");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Item Name:");
                item.itemName = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new exact Stock Quantity:");
                item.quantity = sc.nextInt();
                sc.nextLine();
                break;
            case 3:
                System.out.println("Enter quantity you added to stock:");
                int inbound = sc.nextInt();
                sc.nextLine();
                item.quantity += inbound;
                break;
            case 4:
                System.out.println("Enter new unit Price (in Rs):");
                item.price = sc.nextDouble();
                sc.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Inventory tracking metric updated");
    }
}