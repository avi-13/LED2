package Day4.Switchs;

import java.util.Scanner;

public class Nearestno {
    // Program to Convert even number into its upper nearest odd number.
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            int num,x;
            System.out.print("Enter the number ");
            num= demo.nextInt();
            x= num%2;
            switch (x){
                case 0:
                    num+=1;
                    break;
                default:
                    break;
            }
            System.out.println(num);

        }
    }
