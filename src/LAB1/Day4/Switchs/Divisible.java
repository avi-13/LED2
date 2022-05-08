package Day4.Switchs;

import java.util.Scanner;

public class Divisible {
    //JAVA Program to check whether a number is divisible by 5 and 11 or not.
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            int num,x;
            System.out.print("Enter the number ");
            num= demo.nextInt();
            if ((num%5==0)&(num%11==0)){
                x=1;
            }
            else {
                x=0;
            }
            switch (x){
                case 1:
                    System.out.println("The number is divisible by 5 and 11.");
                    break;
                default:
                    System.out.println("The number is not divisible by both 5 and 11.");
                    break;
            }
        }
    }
