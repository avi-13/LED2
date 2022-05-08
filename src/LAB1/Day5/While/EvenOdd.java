package LAB1.Day5.While;

public class EvenOdd {
    public static void main(String[] args) {
        int i = 10;
        int EN = 0;
        int ON = 0;
        while (i<=30){
            if (i % 2 == 0) {
                EN += 1;
            }
            else {
                ON += 1;
            }

            ++i;
        }
        System.out.println("Odd nos are:\t" + ON);
        System.out.println("Even nos are:\t" + EN);

    }
}


class SumEvenOdd {
    public static void main(String[] args) {
        int i = 1;
        int EN = 0;
        int ON = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                EN += i;
            } else {
                ON += i;
            }

            ++i;
        }
        System.out.println("Sum of Odd nos from 1 to 30 are:\t" + ON);
        System.out.println("Sum of Even nos from 1 to 30 are:\t" + EN);

    }
}


