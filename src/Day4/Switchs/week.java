package Day4.Switchs;

import java.util.Scanner;

public class week {//JAVA Program to take the value from the user as an input week number and print weekday by
    //using the switch statement
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            int weekday;
            System.out.print("Enter the week number ");
            weekday = demo.nextInt();
            switch (weekday){
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }