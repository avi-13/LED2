package Day4.Switchs;

import java.util.Scanner;

//Program to convert a positive number into negative number and negative number into a positive
//number
public class Positiveneg {
    public static void main(String[] args) {
        Scanner demo= new Scanner(System.in);
        int num,x,num1;
        System.out.println("Enter the number ");
        num= demo.nextInt();
        if (num<0){
            x=-1;
        } else if (num==0) {
            x= 0;
        } else {
            x=1;
        };
        switch (x){
            case 0:
                System.out.println("The number is zero");
                break;
            default:
                num1=(-num);
                System.out.println(num1);
                break;
        }
    }
}