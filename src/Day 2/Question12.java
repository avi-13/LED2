import java.util.Scanner;

//Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scanner.nextInt();
        int sqr= (int) Math.pow(a,2);
        System.out.println("The square of the number is:"+sqr);
    }
}
