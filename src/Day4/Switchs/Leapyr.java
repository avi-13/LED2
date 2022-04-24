package Day4.Switchs;

import java.util.Scanner;

public class Leapyr {
    //JAVA Program to check whether a year is a leap year or not
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            int year,x;

            System.out.print("Enter the year ");
            year= demo.nextInt();
            if (year%400==0)
            {
                x=1;
            }
            else if((year%4==0)&&(year%100!=0)) {
                x=1;
            }
            else {
                x=0;
            }
            switch (x){
                case 1:
                    System.out.println("It is a leap year.");
                    break;
                default:
                    System.out.println("It is not a leap year.");
                    break;
            }
        }
    }
