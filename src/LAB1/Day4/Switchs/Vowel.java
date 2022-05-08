package Day4.Switchs;

import java.util.Scanner;

public class Vowel {
    //JAVA Program to take the value from the user as input any alphabet and check whether it is
//vowel or consonant
        public static void main(String[] args) {
            Scanner demo = new Scanner(System.in);
            System.out.println("Enter the character ");
            char char1;
            char1 = demo.next().charAt(0);
            Character.toLowerCase(char1);
            switch (char1) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("The alphabet is a vowel.");
                    break;
                default:
                    System.out.println("The alphabet is a consonant.");
                    break;
            }
        }
    }
