package Day4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.printf("Enter a number: \t");
        num = scanner.nextInt();
        if (num%2==0) {
            System.out.println("The number is EVEN");
        } else if (num % 2 != 0) {
            System.out.println("The number is ODD");
        } else {
            System.out.println("The number is zero");
        }
    }
}
