import java.util.Scanner;

//. Write a program to calculate sum of four numbers taking user input.
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        System.out.println("Enter third number");
        int num3=scanner.nextInt();
        System.out.println("Enter fourth number");
        int num4=scanner.nextInt();

        int sum=num1+num2+num3+num4;
        System.out.println("The sum is:"+sum);

    }
}
