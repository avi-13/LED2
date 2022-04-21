package Day4;

import java.util.Scanner;

//. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
public class Ques16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle: ");
        int angle3 = input.nextInt();

        if (angle1==angle2&&angle1==angle3) {
            System.out.println("Triangle is equilateral.");
        } else if (angle1==angle2||angle2==angle3||angle1==angle3){
            System.out.println("Triangle is isosceles.");
        } else {
            System.out.println("Triangle is scalene.");
        }
    }
}
