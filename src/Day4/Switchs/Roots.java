package Day4.Switchs;

import java.util.Scanner;

public class Roots {
    //JAVA Program to find all the roots of a quadratic equation.
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            double r1, r2,a,b,c,determinant,sqrt;
            int det1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a ::");
            a= sc.nextDouble();
            System.out.println("Enter the value of b ::");
            b= sc.nextDouble();
            System.out.println("Enter the value of c ::");
            c = sc.nextDouble();
            determinant = (b*b)-(4*a*c);
            sqrt = Math.sqrt(determinant);
            if (determinant==0)
            {
                det1=0;
            }
            else {
                det1=1;
            };
            switch (det1){
                case 0:
                    System.out.println("Root is :: "+(-b + sqrt)/(2*a));
                    break;
                default:
                    r1 = (-b + sqrt)/(2*a);
                    r2 = (-b - sqrt)/(2*a);
                    System.out.println("Roots are :: "+ r1 +" and "+r2);
                    break;
            }
        }
    }

