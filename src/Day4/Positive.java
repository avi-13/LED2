package Day4;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.printf("Enter a number: \t");
        num = scanner.nextInt();
        if (num>0) {
            System.out.println("The number is Positive");
                    }
        else if (num < 0) {
            System.out.println("The number is negative");
                    }
        else{
            System.out.println("The number is zero");
        }
    }
}
