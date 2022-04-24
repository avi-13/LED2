package Day4;

import java.util.Scanner;

public class ODDeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.printf("Enter a number: \t");
        num = scanner.nextInt();
        switch (num%2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;


        }

    }
}
