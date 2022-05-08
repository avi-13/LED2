package Day4;
//Write a JAVA program to input week number and print weekday.
import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= input.nextInt();
        if (day==1){
            System.out.println("It is Sunday");
        }
        else if (day==2){
            System.out.println("It is Monday");
        }
        else if (day==3){
            System.out.println("It is Tuesday");
        }
        else if (day==4){
            System.out.println("It is Wednesday");
        }
        else if (day==5){
            System.out.println("It is Thursday");
        }
        else if (day==6){
            System.out.println("It is Friday");
        }
        else if (day==7){
            System.out.println("It is Saturday");
        }
        else{
            System.out.println("Invalid Number!");
        }
    }
}
