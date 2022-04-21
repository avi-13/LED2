package Day4;

import java.util.Scanner;

//Write a JAVA program to check whether a year is leap year or not.
public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter an Year : ");
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
        else {
            System.out.println("Specified year is not a leap year");
        }
    }
}
