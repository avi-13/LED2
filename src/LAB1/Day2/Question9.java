import java.util.Scanner;

//Ask user to give two double input for length and breadth of a rectangle and print area type
//casted to int.
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Length:");
        double l = scanner.nextDouble();
        System.out.println("Enter Breadth:");
        double b = scanner.nextDouble();
        double area= l*b;
        int areas=(int) (area);
        System.out.println("The area is:"+areas);

    }
}
