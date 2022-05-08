package LAB1.Day5.While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:\t");
        int num = input.nextInt();
        int fac = 1;
        int i = 1;
        while (num!=1) {
            fac = fac * num;
            num--;
        }
        System.out.println("The Factorial of "+num+ "is:\t" +fac);
    }
}
