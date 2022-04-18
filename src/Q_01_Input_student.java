//Write a program to take student details as input and display the result.
import java.math.BigInteger;
import java.util.Scanner;

public class Q_01_Input_student {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the students name");
        String name = scanner.nextLine();

        System.out.println("enter the class of student");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("enter the address of student");
        String address = scanner.nextLine();

        System.out.println("Enter the phone number of students");
        BigInteger number = scanner.nextBigInteger();

        System.out.println("here are the students details \nName:\t"+name+"\nAge:\t"+age+"\nAddress:\t"+address+"\nPhone:\t"+number);
    }
}
