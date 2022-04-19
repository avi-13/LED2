
import java.util.Scanner;

//Write a program to take student details as input and display the result.
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter address:");
        String location = scanner.nextLine();
        System.out.println("Enter contact:");
        long  contact = scanner.nextLong();
        System.out.println("Name is:"+name+"\n"+"Age is:"+age+"\n"+"address is:"+location+"\n"+"contact is:"+contact);
    }
}
