import java.util.*;

public class MenuDrivenCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU DRIVEN CALCULATOR =====");
            System.out.println("Enter 1 for Addition (+)");
            System.out.println("Enter 2 for Subtraction (-)");
            System.out.println("Enter 3 for Multiplication (*)");
            System.out.println("Enter 4 for Division (/)");
            System.out.println("Enter 5 for Modulus (%)");
            System.out.println("Enter 6 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 6) {
                return;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Wrong input");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Result: " + (num1 + num2));
                    break;
                }
                case 2: {
                    System.out.println("Result: " + (num1 - num2));
                    break;
                }
                case 3: {
                    System.out.println("Result: " + (num1 * num2));
                    break;
                }
                case 4: {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                }
                case 5: {
                    if (num2 == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 % num2));
                    }
                    break;
                }
            }
        }
    }
}