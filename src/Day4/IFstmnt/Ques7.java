package Day4;

import java.util.Scanner;

//Write a JAVA program to check whether a character is alphabet or not.
public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isDigit(str);
        if(result) {
            System.out.println("'" + str + "' is a number");
        }
        else {
            System.out.println("'" + str + "' is a alphabet");
        }
    }
}

