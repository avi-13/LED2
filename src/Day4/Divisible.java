package Day4;
//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: \t");
        num = scanner.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else if (num % 5 == 0) {
            System.out.println("divisible only by 5");
        } else if (num % 11 == 0) {
            System.out.println("divisible only by 11 ");
        } else {
            System.out.println("NOt Divisible by both");

        }
    }
}
