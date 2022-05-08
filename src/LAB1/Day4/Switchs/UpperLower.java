package Day4.Switchs;

import java.util.Scanner;

public class UpperLower {
    //JAVA Program to check whether a character is an uppercase or lowercase alphabet
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            System.out.println("Enter the character ");
            int x;
            char char1 ;
            char1= demo.next().charAt(0);
            if (Character.isUpperCase(char1)){
                x=1;
            } else {
                x=2;
            }
            switch (x){
                case 1:
                    System.out.println("The character is in Uppercase");
                    break;
                default:
                    System.out.println("The character is in Lowercase");
                    break;
            }
        }
    }
