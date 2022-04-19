import java.util.Scanner;

//Write a program to take two integer inputs from user and print sum and product of them.
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is:"+sum);
        int product=num1*num2;
        System.out.println("The product is:"+product);

    }
}
