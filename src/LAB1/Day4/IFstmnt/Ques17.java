package Day4;

import java.util.Scanner;

//Write a JAVA program to find all roots of a quadratic equation
public class Ques17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();

        double determinant = ((b*b)-(4*a*c));
        double sqrt = Math.sqrt(determinant);


        double root1 = (sqrt-b)/(2*a);
        double root2 = -(b+sqrt)/(2*a);

        System.out.println("Solution 1: "+root1+"\nSolution 2: "+root2);
    }
}
//
//    double determinant = ((b * b) - (4 * a * c));
//    double sqrt = Math.sqrt(determinant);
//
//        if (determinant>0) {
//                double first_root = (-b + sqrt) / (2 * a);
//                double second_root = (-b - sqrt) / (2 * a);
//
//                System.out.println("Solution 1: " +first_root + "\nSolution 2: " +second_root);
//
//                }
//                else if(determinant==0){
//                System.out.println("root is " +(-b) / (2 * a));