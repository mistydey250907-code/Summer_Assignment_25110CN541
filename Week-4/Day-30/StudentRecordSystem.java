import java.util.*;

public class StudentRecordSystem {
    static Scanner sc = new Scanner(System.in);
    static String[] rolls;
    static String[] names;
    static String[] courses;
    static int size = 0;

    public static void main(String[] args) {
        System.out.print("Enter the maximum number of student records the system can hold: ");
        int maxCapacity = sc.nextInt();
        sc.nextLine();

        rolls = new String[maxCapacity];
        names = new String[maxCapacity];
        courses = new String[maxCapacity];

        while (true) {
            System.out.println("0. Print all student records");
            System.out.println("1. Add a new student record");
            System.out.println("2. Update student details");
            System.out.println("3. Find a specific student");
            System.out.println("4. Remove a student record");
            System.out.println("5. Stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    if (size == 0) {
                        System.out.println("No records found.");
                        break;
                    }
                    for (int i = 0; i < size; i++) {
                        System.out.println("Roll No: " + rolls[i] + " | Name: " + names[i] + " | Course: " + courses[i]);
                    }
                    break;
                }
                case 1: {
                    if (size >= rolls.length) {
                        System.out.println("Database is full! Cannot add more records (Max limit reached: " + rolls.length + ").");
                        break;
                    }
                    System.out.println("Enter Roll No:");
                    String roll = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (rolls[i].equalsIgnoreCase(roll)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Student record already exists.");
                        break;
                    }

                    System.out.println("Enter student name:");
                    String name = sc.nextLine();
                    System.out.println("Enter course:");
                    String course = sc.nextLine();

                    rolls[size] = roll;
                    names[size] = name;
                    courses[size] = course;
                    size++;
                    System.out.println("Student record added successfully!");
                    break;
                }
                case 2: {
                    System.out.println("Enter Roll No to update:");
                    String roll = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (rolls[i].equalsIgnoreCase(roll)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Student Roll No not found.");
                        break;
                    }

                    System.out.println("What field do you want to update?");
                    System.out.println("1. Name\n2. Course");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();

                    if (updateChoice == 1) {
                        System.out.println("Enter new Name:");
                        names[foundIndex] = sc.nextLine();
                    } else if (updateChoice == 2) {
                        System.out.println("Enter new Course:");
                        courses[foundIndex] = sc.nextLine();
                    } else {
                        System.out.println("Invalid choice.");
                        break;
                    }
                    System.out.println("Student record updated successfully!");
                    break;
                }
                case 3: {
                    System.out.println("Enter Roll No to find:");
                    String roll = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (rolls[i].equalsIgnoreCase(roll)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Roll No: " + rolls[foundIndex] + " | Name: " + names[foundIndex] + " | Course: " + courses[foundIndex]);
                    } else {
                        System.out.println("Student Roll No not found.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter Roll No to remove:");
                    String roll = sc.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < size; i++) {
                        if (rolls[i].equalsIgnoreCase(roll)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex == -1) {
                        System.out.println("Student Roll No not found.");
                        break;
                    }

                    for (int i = foundIndex; i < size - 1; i++) {
                        rolls[i] = rolls[i + 1];
                        names[i] = names[i + 1];
                        courses[i] = courses[i + 1];
                    }
                    size--;
                    System.out.println("Student record removed successfully!");
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