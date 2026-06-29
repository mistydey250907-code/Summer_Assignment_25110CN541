import java.util.*;

public class MiniEmployeeManagement {
    static Scanner sc = new Scanner(System.in);
    static String[] ids;
    static String[] names;
    static String[] departments;
    static int size = 0;

    public static void main(String[] args) {
        System.out.print("Enter the maximum number of employees the system can hold: ");
        int max = sc.nextInt();
        sc.nextLine();

        ids = new String[max];
        names = new String[max];
        departments = new String[max];

        while (true) {
            System.out.println("0. View all employees");
            System.out.println("1. Add a new employee");
            System.out.println("2. Update employee details");
            System.out.println("3. Search for an employee");
            System.out.println("4. Remove an employee");
            System.out.println("5. Stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    if (size == 0) {
                        System.out.println("No employee records found.");
                        break;
                    }
                    for (int i = 0; i < size; i++) {
                        System.out.println("Emp ID: " + ids[i] + " | Name: " + names[i] + " | Department: " + departments[i]);
                    }
                    break;
                }
                case 1: {
                    if (size >= ids.length) {
                        System.out.println("System is at full capacity! Cannot add more employees.");
                        break;
                    }
                    System.out.println("Enter Employee ID:");
                    String id = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (ids[i].equalsIgnoreCase(id)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("An employee with this ID already exists.");
                        break;
                    }

                    System.out.println("Enter employee name:");
                    String name = sc.nextLine();
                    System.out.println("Enter department:");
                    String dept = sc.nextLine();

                    ids[size] = id;
                    names[size] = name;
                    departments[size] = dept;
                    size++;
                    System.out.println("Employee record is added");
                    break;
                }
                case 2: {
                    System.out.println("Enter Employee ID to update:");
                    String id = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (ids[i].equalsIgnoreCase(id)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Employee ID not found.");
                        break;
                    }

                    System.out.println("What field do you want to update?");
                    System.out.println("1. Name\n2. Department");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();

                    if (updateChoice == 1) {
                        System.out.println("Enter new Name:");
                        names[foundIndex] = sc.nextLine();
                    } else if (updateChoice == 2) {
                        System.out.println("Enter new Department:");
                        departments[foundIndex] = sc.nextLine();
                    } else {
                        System.out.println("Invalid choice.");
                        break;
                    }
                    System.out.println("Employee record is updated");
                    break;
                }
                case 3: {
                    System.out.println("Enter Employee ID to search:");
                    String id = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (ids[i].equalsIgnoreCase(id)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Found! Emp ID: " + ids[foundIndex] + " | Name: " + names[foundIndex] + " | Department: " + departments[foundIndex]);
                    } else {
                        System.out.println("Employee record not found.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter Employee ID to remove:");
                    String id = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (ids[i].equalsIgnoreCase(id)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Employee ID not found.");
                        break;
                    }

                    for (int i = foundIndex; i < size - 1; i++) {
                        ids[i] = ids[i + 1];
                        names[i] = names[i + 1];
                        departments[i] = departments[i + 1];
                    }
                    size--;
                    System.out.println("Employee record");
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