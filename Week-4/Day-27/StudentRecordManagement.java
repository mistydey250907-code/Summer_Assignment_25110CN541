import java.util.*;

public class StudentRecordManagement {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, StudentInfo> map = new HashMap<>();

    static class StudentInfo {
        String name;
        String course;
        String email;
        double gpa;

        StudentInfo(String name, String course, String email, double gpa) {
            this.name = name;
            this.course = course;
            this.email = email;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "| Name: " + name + " | Course: " + course + " | Email: " + email + " | GPA: " + gpa;
        }
    }

    public static void main(String[] args) {
        map.put(1, new StudentInfo("Alice Smith", "Computer Science", "alice@univ.edu", 3.8));
        map.put(4, new StudentInfo("Bob Jones", "Mechanical Eng", "bob@univ.edu", 3.2));
        map.put(2, new StudentInfo("Charlie Brown", "Data Science", "charlie@univ.edu", 3.9));
        map.put(3, new StudentInfo("Diana Prince", "Electrical Eng", "diana@univ.edu", 3.5));

        while (true) {
            System.out.println("\n===== STUDENT RECORD MANAGEMENT =====");
            System.out.println("Enter 0 to print all student records");
            System.out.println("Enter 1 to add a new student record");
            System.out.println("Enter 2 to update a student record");
            System.out.println("Enter 3 to find a student record");
            System.out.println("Enter 4 to remove a student record");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, StudentInfo> e : map.entrySet()) {
                        System.out.println("Roll No: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addStudent();
                    break;
                }
                case 2: {
                    updateStudent();
                    break;
                }
                case 3: {
                    findStudent();
                    break;
                }
                case 4: {
                    removeStudent();
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

    public static void addStudent() {
        System.out.println("Enter student Roll No:");
        int roll = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(roll)) {
            System.out.println("Student record already exists.");
            return;
        }

        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter course:");
        String course = sc.nextLine();
        System.out.println("Enter email:");
        String email = sc.nextLine();
        System.out.println("Enter GPA:");
        double gpa = sc.nextDouble();
        sc.nextLine();

        map.put(roll, new StudentInfo(name, course, email, gpa));
        System.out.println("Student record added");
    }

    public static void removeStudent() {
        System.out.println("Enter student Roll No:");
        int roll = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(roll)) {
            System.out.println("Student Roll No not found.");
            return;
        }
        map.remove(roll);
        System.out.println("Student record removed ");
    }

    public static void findStudent() {
        System.out.println("Enter student Roll No to find:");
        int roll = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(roll)) {
            System.out.println("Roll No: " + roll + " " + map.get(roll));
        } else {
            System.out.println("Student Roll No not found.");
        }
    }

    public static void updateStudent() {
        System.out.println("Enter student Roll No to update:");
        int roll = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(roll)) {
            System.out.println("Student Roll No not found.");
            return;
        }

        StudentInfo std = map.get(roll);

        System.out.println("What do you want to update?");
        System.out.println("1. Name\n2. Course\n3. Email\n4. GPA");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Name:");
                std.name = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Course:");
                std.course = sc.nextLine();
                break;
            case 3:
                System.out.println("Enter new Email:");
                std.email = sc.nextLine();
                break;
            case 4:
                System.out.println("Enter new GPA:");
                std.gpa = sc.nextDouble();
                sc.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Student record updated ");
    }
}