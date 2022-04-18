//Write a program to calculate sum of four numbers taking user input.
import java.util.Scanner;
public class Q_02_sum_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3");
        int num3 = scanner.nextInt();
        System.out.println("Enter num4");
        int num4 = scanner.nextInt();

        int sum = num1+num2+num3+num4;

        System.out.println("The sum of given number is: "+sum);
    }
}
