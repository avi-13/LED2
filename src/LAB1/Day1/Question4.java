/* Write a program to calculate the total marks of four subjects of a student and the total
percentage secured. And use following conditions to generate the final result;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail.*/
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
       Scanner myObj= new Scanner(System.in);
        System.out.println("Input marks for math:");
        System.out.println("Input marks for nepali:");
        System.out.println("Input marks for science:");
        System.out.println("Input marks for english:");
        int math = myObj.nextInt();
        int nepali = myObj.nextInt();
        int science = myObj.nextInt();
        int english = myObj.nextInt();

        int percentage=(math+nepali+science+english)/4;
        System.out.println("The percentage is:"+percentage);
        if (percentage>=70)
        {
            System.out.println("First class");
        }
        else if(percentage>59)
        {
            System.out.println("Upper Second class");
        }
        else if (percentage>49)
        {
            System.out.println("Second class");
        }
        else if (percentage>39)
        {
            System.out.println("Third class");
        }
        else
            System.out.println("Fail");

    }
      /*  float sub1 = 80;
        float sub2 = 60;
        float sub3 = 70;
        float sub4 = 90;

        float total = sub1 + sub2 + sub3 + sub4;
        float percentage = total / 4;
        String result;
        result = (percentage >= 70) ? "First class" : (percentage >= 59) ? "upper second class" : (percentage >= 49) ? "second class" : (percentage > 39) ? "Third class" : "Fail";
        System.out.println("Hey, your result is " + result);


    }*/
}
