package LAB1.Day5.While;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a num:\t");
        int num = input.nextInt();
        int i = 1;
        while (i<=10){
            int mul = num * i;
            System.out.println(num + "*" + i + "=" + mul);
            i++;

        }
    }
}



class MultiplicationTablePrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a num:\t");
        int num1 = input.nextInt();
        int i = 1;

        if (num1 < 0){
            System.out.println("Enter a positive integer");
        }
        else{
        while (i<=10) {
            int mul = num1 * i;
            System.out.println(num1 + "*" + i + "=" + mul);
            i++;
        }

        }
    }
}
