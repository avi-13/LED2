package Day4.Switchs;

import java.util.Scanner;

public class Ampm {
    //Program to take the hours and minutes as input by the user and the show that whether it is AM
//or PM by using the switch statement.
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            int h,m,time,x;
            System.out.println("Enter the hours ");
            h= demo.nextInt();
            System.out.println("Enter the minutes ");
            m= demo.nextInt();
            if (h>=12&& h<24){
                x=1;
            } else{
                x=0;
            }
            switch (x){
                case 0:
                    System.out.println("The time is in AM ");
                    break;
                default:
                    System.out.println("The time is in PM ");
                    break;
            }

        }
    }