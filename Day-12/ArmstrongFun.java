import java.util.Scanner;

public class ArmstrongFun {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {
            int rem = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power *= rem;
            }

            sum += power;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}