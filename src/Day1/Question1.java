//Write a program to check whether a person can cast a vote or not. Condition is you must
//be above 18 years to vote.
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter Age:");
        int age= myObj.nextInt();
        if (age>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }

}
