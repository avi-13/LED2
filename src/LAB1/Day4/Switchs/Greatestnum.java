package Day4.Switchs;

import java.util.Scanner;

class Greatestnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a num");
        int a = scanner.nextInt();
        System.out.printf("Enter a num");
        int b = scanner.nextInt();
        System.out.printf("Enter a num");
        int c = scanner.nextInt();
        int num = (a > b && a > c) ? 0 : (b > a && b > c) ? 1 : (c > a && c > b) ? 2 : 3;
        switch (num) {
            case 0:
                System.out.println("a is greatest");
            case 1:
                System.out.println("B is the greatest");
            case 2:
                System.out.println("c is greatest");
            default:
                System.out.println("All are equal");
        }
    }
}
