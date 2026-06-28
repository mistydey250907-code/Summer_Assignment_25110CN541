import java.util.*;

public class BankAccountSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, AccountInfo> map = new HashMap<>();

    static class AccountInfo {
        String holderName;
        String accountType;
        double balance;

        AccountInfo(String holderName, String accountType, double balance) {
            this.holderName = holderName;
            this.accountType = accountType;
            this.balance = balance;
        }
        public String toString() {
            return "| Holder: " + holderName + " | Type: " + accountType + " | Balance: Rs. " + balance;
        }
    }

    public static void main(String[] args) {
        map.put(1001, new AccountInfo("Adam Silvenia", "Savings", 50000.0));
        map.put(1004, new AccountInfo("Cam Silvenia", "Current", 120000.0));
        map.put(1002, new AccountInfo("Sierra Karinton", "Savings", 85000.0));
        map.put(1003, new AccountInfo("Rora Monabell", "Savings", 25000.0));

        while (true) {
            System.out.println("Enter 0 to print all account records");
            System.out.println("Enter 1 to add a new account");
            System.out.println("Enter 2 to update account details / manage funds");
            System.out.println("Enter 3 to find an account record");
            System.out.println("Enter 4 to remove an account record");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, AccountInfo> e : map.entrySet()) {
                        System.out.println("Account No: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addAccount();
                    break;
                }
                case 2: {
                    updateAccount();
                    break;
                }
                case 3: {
                    findAccount();
                    break;
                }
                case 4: {
                    removeAccount();
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

    public static void addAccount() {
        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(accNo)) {
            System.out.println("Account already exists.");
            return;
        }

        System.out.println("Enter account holder name:");
        String name = sc.nextLine();
        System.out.println("Enter account type (Savings/Current):");
        String type = sc.nextLine();
        System.out.println("Enter initial deposit amount (in Rs):");
        double bal = sc.nextDouble();
        sc.nextLine();

        map.put(accNo, new AccountInfo(name, type, bal));
        System.out.println("Account created successfully!");
    }

    public static void removeAccount() {
        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(accNo)) {
            System.out.println("Account number not found.");
            return;
        }
        map.remove(accNo);
        System.out.println("Account removed ");
    }

    public static void findAccount() {
        System.out.println("Enter Account Number to find:");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(accNo)) {
            System.out.println("Account No: " + accNo + " " + map.get(accNo));
        } else {
            System.out.println("Account number not found.");
        }
    }

    public static void updateAccount() {
        System.out.println("Enter Account Number to update:");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(accNo)) {
            System.out.println("Account number not found.");
            return;
        }

        AccountInfo acc = map.get(accNo);

        System.out.println("What do you want to do?");
        System.out.println("1. Change Holder Name\n2. Change Account Type\n3. Deposit Money\n4. Withdraw Money");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Name:");
                acc.holderName = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Account Type:");
                acc.accountType = sc.nextLine();
                break;
            case 3:
                System.out.println("Enter deposit amount (in Rs):");
                double dep = sc.nextDouble();
                sc.nextLine();
                acc.balance += dep;
                break;
            case 4:
                System.out.println("Enter withdrawal amount (in Rs):");
                double with = sc.nextDouble();
                sc.nextLine();
                if (with > acc.balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    acc.balance -= with;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
    }
}