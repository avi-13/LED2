package LAB1.Day5.While;

import java.util.Arrays;
import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        for ( int i = 1; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}

 class Pattern2 {
    public static void main(String [] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


class Pattern3{
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }
}

class Pattern4 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            // print spaces
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


class Pattern5{
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

class Pattern6{
    public static void main(String[] args) {

        int i;
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            for (int l = i; l < (i+1); l++) {
                    System.out.print(i);
                }
            }
            System.out.println(" ");
        }
    }
}


class Pattern7{
    public static void main(String[] args) {

        int i;
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print(k);
                for (int l = i; l < (i + 1); l++) {
                    System.out.print(k);
                }
                System.out.println(" ");
            }
        }
        }
    }



