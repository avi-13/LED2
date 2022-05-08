//Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter rollno:");
        int rollno = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter field of interest:");
        String interest = scanner.nextLine();

        System.out.println("My name is: " + name+"\t"+"My roll no is:"+rollno+"\t"+"My field of interest is:"+interest);

    }
}
