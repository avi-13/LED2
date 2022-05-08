package Day4.Switchs;

import java.util.Scanner;

public class Alphabet {
    //JAVA Program to take the value from the user as input any character and check whether it is
//the alphabet, digit or special character.
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            System.out.println("Enter the character ");
            char char1 ;
            char1= demo.next().charAt(0);
            Character.toLowerCase(char1);
            switch (char1){
                case '0','1','2','3','4','5','6','7','8','9':
                    System.out.println("The character is a digit.");
                    break;
                case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z':
                    System.out.println("The character is an alphabet.");
                    break;
                default:
                    System.out.println("The character is a special character");
                    break;
            }
        }
    }
