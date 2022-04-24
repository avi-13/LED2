package Day4;

import java.util.Scanner;
class Max2_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter 1st number: \t");
        int num1 = scanner.nextInt();
        System.out.printf("Enter 2nd number: \t");
        int num2 = scanner.nextInt();

        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println(num1 + "\tis maximum");
            } else {
                System.out.println(num2 + "\tis maximum");

            }
        }
        else{
            System.out.println("Please type two different numbers");
        }

    }
}

class Max3_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter 1st number: \t");
        int num1 = scanner.nextInt();
        System.out.printf("Enter 2nd number: \t");
        int num2 = scanner.nextInt();
        System.out.printf("Enter 3rd number: \t");
        int num3 = scanner.nextInt();

        if (num1 != num2 && num2 != num3) {
            if (num1 > num2 && num1 >num3) {
                System.out.println(num1 + "\tis maximum");
            }
            else if (num2 >num1 && num2 >num3){
                System.out.println(num2 + "\tis maximum");
            }
            else{
                System.out.println(num3 + "\tis maximum");
            }

            }
        else  {
            System.out.println("Please type 3 different numbers");
        }

    }
}