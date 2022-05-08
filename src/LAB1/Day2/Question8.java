import java.util.Scanner;

//Take two integer inputs from user. First calculate the sum of two and then product.
//Finally, calculate the division of thus obtained sum and product and print the result.
public class Question8 {
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

         float division=(sum/product);
         System.out.println("The division of sum and product is:"+division);

    }
}
