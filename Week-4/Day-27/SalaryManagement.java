import java.util.*;

public class SalaryManagement {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, SalaryInfo> map = new HashMap<>();

    static class SalaryInfo {
        String name;
        double baseSalary;
        double allowance;
        double taxDeduction;
        double netSalary;

        SalaryInfo(String name, double baseSalary, double allowance, double taxDeduction) {
            this.name = name;
            this.baseSalary = baseSalary;
            this.allowance = allowance;
            this.taxDeduction = taxDeduction;
            this.netSalary = calculateNetSalary();
        }

        double calculateNetSalary() {
            return (baseSalary + allowance) - taxDeduction;
        }

        @Override
        public String toString() {
            return "| Name: " + name + " | Base: $" + baseSalary + " | Allowance: $" + allowance + 
                   " | Tax Deduction: $" + taxDeduction + " | Net Salary: $" + netSalary;
        }
    }

    public static void main(String[] args) {
        map.put(101, new SalaryInfo("Adam Silvenia", 5000.0, 600.0, 450.0));
        map.put(104, new SalaryInfo("Cam Silvenia", 6200.0, 800.0, 600.0));
        map.put(102, new SalaryInfo("Sierra Karinton", 9500.0, 1200.0, 1100.0));
        map.put(103, new SalaryInfo("Rora Monabell", 4200.0, 500.0, 350.0));

        while (true) {
            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("Enter 0 to print all employee salary details");
            System.out.println("Enter 1 to add a new employee salary record");
            System.out.println("Enter 2 to update salary components");
            System.out.println("Enter 3 to find salary information of an employee");
            System.out.println("Enter 4 to remove an employee salary record");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, SalaryInfo> e : map.entrySet()) {
                        System.out.println("ID: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addRecord();
                    break;
                }
                case 2: {
                    updateSalary();
                    break;
                }
                case 3: {
                    findRecord();
                    break;
                }
                case 4: {
                    removeRecord();
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

    public static void addRecord() {
        System.out.println("Enter the id of the employee:");
        int i = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(i)) {
            System.out.println("Record already exists.");
            return;
        }

        System.out.println("Enter the name of the employee:");
        String name = sc.nextLine();
        System.out.println("Enter base salary:");
        double base = sc.nextDouble();
        System.out.println("Enter allowance:");
        double allow = sc.nextDouble();
        System.out.println("Enter tax deduction:");
        double tax = sc.nextDouble();
        sc.nextLine();

        map.put(i, new SalaryInfo(name, base, allow, tax));
        System.out.println("Salary record added ");
    }

    public static void removeRecord() {
        System.out.println("Enter the id of the employee:");
        int i = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(i)) {
            System.out.println("Employee ID not found.");
            return;
        }
        map.remove(i);
        System.out.println("Salary record removed ");
    }

    public static void findRecord() {
        System.out.println("Enter the id of the employee to find:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("ID: " + id + " " + map.get(id));
        } else {
            System.out.println("Employee ID not found.");
        }
    }

    public static void updateSalary() {
        System.out.println("Enter the id of the employee to update:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Employee ID not found.");
            return;
        }

        SalaryInfo emp = map.get(id);

        System.out.println("What do you want to update?");
        System.out.println("1. Name\n2. Base Salary\n3. Allowance\n4. Tax Deduction");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Name:");
                emp.name = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Base Salary:");
                emp.baseSalary = sc.nextDouble();
                sc.nextLine();
                emp.netSalary = emp.calculateNetSalary();
                break;
            case 3:
                System.out.println("Enter new Allowance:");
                emp.allowance = sc.nextDouble();
                sc.nextLine();
                emp.netSalary = emp.calculateNetSalary();
                break;
            case 4:
                System.out.println("Enter new Tax Deduction:");
                emp.taxDeduction = sc.nextDouble();
                sc.nextLine();
                emp.netSalary = emp.calculateNetSalary();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Salary breakdown updated");
    }
}