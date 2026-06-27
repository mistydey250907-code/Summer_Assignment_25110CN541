import java.util.*;

public class MarksheetManagement {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, StudentMarks> map = new HashMap<>();

    static class StudentMarks {
        String name;
        int math;    
        int science; 
        int english;
        String grade;

        StudentMarks(String name, int math, int science, int english) {
            this.name = name;
            this.math = math;
            this.science = science;
            this.english = english;
            this.grade = calculateGrade();
        }

        String calculateGrade() {
            double total = math + science + english;
            double percentage = (total / 300.0) * 100;
            if (percentage >= 90) return "A+";
            else if (percentage >= 80) return "A";
            else if (percentage >= 70) return "B";
            else if (percentage >= 60) return "C";
            else if (percentage >= 50) return "D";
            else return "Fail";
        }
        public String toString() {
            int total = math + science + english;
            double percentage = (total / 300.0) * 100;
            return "| Name: " + name + " | Math: " + math + " | Science: " + science + 
                   " | English: " + english + " | Total: " + total + "/300 (" + String.format("%.2f", percentage) + "%) | Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        // Sample baseline data
        map.put(1, new StudentMarks("Alice Smith", 92, 88, 95));
        map.put(2, new StudentMarks("Bob Jones", 74, 65, 80));
        map.put(3, new StudentMarks("Charlie Brown", 55, 48, 62));

        while (true) {
           System.out.println("Enter your choice");
            System.out.println("0. Print all student marksheets");
            System.out.println("1. Add a new student record");
            System.out.println("2. Update student marks");
            System.out.println("3. Find a student marksheet");
            System.out.println("4. Remove a student record");
            System.out.println("5. Stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, StudentMarks> e : map.entrySet()) {
                        System.out.println("Roll No: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    addStudent();
                    break;
                }
                case 2: {
                    updateMarks();
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
        System.out.println("Enter the Roll No of the student:");
        int roll = sc.nextInt();
        sc.nextLine(); 

        if (map.containsKey(roll)) {
            System.out.println("Student record already exists.");
            return;
        }

        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter Math marks (out of 100):");
        int math = sc.nextInt();
        System.out.println("Enter Science marks (out of 100):");
        int sci = sc.nextInt();
        System.out.println("Enter English marks (out of 100):");
        int eng = sc.nextInt();
        sc.nextLine(); 

        map.put(roll, new StudentMarks(name, math, sci, eng));
        System.out.println("Student marksheet created ");
    }

    public static void removeStudent() {
        System.out.println("Enter the Roll No of the student to remove:");
        int roll = sc.nextInt();
        sc.nextLine(); 

        if (!map.containsKey(roll)) {
            System.out.println("Student Roll No not found.");
            return;
        }
        map.remove(roll);
        System.out.println("Student record deleted ");
    }

    public static void findStudent() {
        System.out.println("Enter the Roll No of the student to find:");
        int roll = sc.nextInt();
        sc.nextLine(); 

        if (map.containsKey(roll)) {
            System.out.println("Roll No: " + roll + " " + map.get(roll));
        } else {
            System.out.println("Student Roll No not found.");
        }
    }

    public static void updateMarks() {
        System.out.println("Enter the Roll No of the student to update:");
        int roll = sc.nextInt();
        sc.nextLine(); 

        if (!map.containsKey(roll)) {
            System.out.println("Student Roll No not found.");
            return;
        }

        StudentMarks std = map.get(roll);

        System.out.println("What field do you want to update?");
        System.out.println("1. Student Name\n2. Math Marks\n3. Science Marks\n4. English Marks");
        int updateChoice = sc.nextInt();
        sc.nextLine(); 

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Name:");
                std.name = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Math Marks:");
                std.math = sc.nextInt();
                sc.nextLine();
                std.grade = std.calculateGrade(); 
                break;
            case 3:
                System.out.println("Enter new Science Marks:");
                std.science = sc.nextInt();
                sc.nextLine();
                std.grade = std.calculateGrade(); 
                break;
            case 4:
                System.out.println("Enter new English Marks:");
                std.english = sc.nextInt();
                sc.nextLine();
                std.grade = std.calculateGrade(); 
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Student marksheet updated ");
    }
}