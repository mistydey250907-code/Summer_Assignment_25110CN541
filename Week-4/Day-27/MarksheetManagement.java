import java.util.Scanner;

class MarksheetManagement {
    private String name;
    private int rollNo;
    private String className;
    private int[] marks;
    private String[] subjects;
    private int totalMarks;
    private double percentage;
    private String grade;

    public MarksheetManagement(String name, int rollNo, String className, String[] subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.subjects = subjects;
        this.marks = new int[subjects.length];
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        calculateResults();
    }

    private void calculateResults() {
        this.totalMarks = 0;
        for (int mark : marks) {
            this.totalMarks += mark;
        }
        
        this.percentage = (double) this.totalMarks / subjects.length;
        if (percentage >= 90) this.grade = "A+";
        else if (percentage >= 80) this.grade = "A";
        else if (percentage >= 70) this.grade = "B";
        else if (percentage >= 60) this.grade = "C";
        else if (percentage >= 50) this.grade = "D";
        else this.grade = "Fail";
    }

    public void displayMarksheet() {
        System.out.println("\n=============================================");
        System.out.println("             PROGRESS REPORT CARD            ");
        System.out.println("=============================================");
        System.out.println(" Student Name : " + name);
        System.out.println(" Roll Number  : " + rollNo);
        System.out.println(" Class        : " + className);
        System.out.println("---------------------------------------------");
        System.out.println(" Subject \t\t Marks Obtained");
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(" " + subjects[i] + " \t\t " + marks[i]);
        }
        
        System.out.println("---------------------------------------------");
        System.out.println(" Total Marks      : " + totalMarks + " / " + (subjects.length * 100));
        System.out.println(" Percentage       : " + percentage + "%");
        System.out.println(" Final Grade      : " + grade);
        System.out.println(" Result Status    : " + (grade.equals("Fail") ? "FAILED" : "PASSED"));
        System.out.println("=============================================");
    }
}

public class MarksheetSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Marksheet Generation System ===");
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Class: ");
        String className = scanner.nextLine();
        
        String[] subjects = {"Mathematics", "Science", "English", "History", "Computer Science"};
        int[] marks = new int[subjects.length];
        
        System.out.println("\nEnter marks out of 100 for the following subjects:");
        for (int i = 0; i < subjects.length; i++) {
            while (true) {
                System.out.print(subjects[i] + ": ");
                int inputMark = scanner.nextInt();
                
                if (inputMark >= 0 && inputMark <= 100) {
                    marks[i] = inputMark;
                    break;
                } else {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            }
        }
    
        MarksheetManagement student = new MarksheetManagement(name, rollNo, className, subjects);
        student.setMarks(marks);
        student.displayMarksheet();

        scanner.close();
    }
}