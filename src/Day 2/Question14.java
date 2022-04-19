import java.util.Scanner;

//Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=scanner.nextInt();
        System.out.println("Enter second number");
        int b=scanner.nextInt();
        System.out.println("Enter third number");
        int c=scanner.nextInt();
        String res;
        String result;
        result=(a==b||b==c||c==a)? "Any two are equal":"Any two are not equal";
        res=(a==b&&b==c&&c==a)? "All three are equal":"All are not equal";

        System.out.println(res);
        System.out.println(result);
    }
}
