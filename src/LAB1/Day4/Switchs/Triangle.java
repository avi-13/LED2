package Day4.Switchs;

import java.util.Scanner;


class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ,b , c;
        System.out.println("a = ");
        a = scanner.nextInt();
        System.out.println("b= ");
        b = scanner.nextInt();
        System.out.println("c= ");
        c= scanner.nextInt();

        int re = (a==b&&b==c)? 0: (a==b||b==c||a==c)?1:2;
                switch(re){
                    case 0:
                        System.out.println("equilateral");
                    case 1:
                        System.out.println("isosceles");
                    case 2:
                        System.out.println("scalene");

                }

    }
}



class triangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ,b , c;
        System.out.printf("a = ");
        a = scanner.nextInt();
        System.out.printf("b= ");
        b = scanner.nextInt();
        System.out.printf("c= ");
        c= scanner.nextInt();

        int re = (a+b>c && b+c>a && a+c>b)? 0:1;
        switch(re){
            case 0:
                System.out.println("It is a triangle ");
                break;
            case 1:
                System.out.println("It is not a triangle");
                break;

        }

    }
}