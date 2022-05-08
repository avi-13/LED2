import java.util.Scanner;

//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true.
public class Question15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= scanner.nextInt();
        System.out.println("Enter the value of b");
        int b= scanner.nextInt();
        String check;
        check=(a<50&&a<b)? "True":"False";
        System.out.println(check);
    }
}
