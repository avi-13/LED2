package Day4;

import java.util.Scanner;

// Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isUpperCase(str);
        if(result) {
            System.out.println("'"+ str+"' is uppercase");
        }
        else {
            System.out.println("'"+ str+"' is lowercase");
        }
    }
}
