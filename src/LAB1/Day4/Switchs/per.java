package Day4.Switchs;
//Using switch statement Write a JAVA program to input marks of five subjects Physics,
//        Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
//        following:
//        Percentage >= 90% : Grade A
//        Percentage >= 80% : Grade B
//        Percentage >= 70% : Grade C
//        Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E
//        Percentage < 40% : Grade F

import javax.swing.*;
import java.util.Scanner;

public class per {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int physics, bio, chem, maths, computer;
        System.out.print("Enter your marks in physics:\t");
        physics = scanner.nextInt();
        System.out.print("Enter your marks in bio:\t");
        bio = scanner.nextInt();
        System.out.print("Enter your marks in chemistry:\t");
        chem = scanner.nextInt();
        System.out.print("Enter your marks in maths:\t");
        maths = scanner.nextInt();
        System.out.print("Enter your marks in computer:\t");
        computer = scanner.nextInt();

        double p = (physics + chem + maths + bio + maths + computer) / 4;
        int t = (p >= 90) ? 0 : (p >= 80) ? 1 : (p >= 70) ? 2 : (p >= 60) ? 3 : (p >= 40) ? 4 : 5;
        System.out.println("your total percentage is :\t" +p);
        switch (t){
            case 0 :
                System.out.println("Grade \"A\" ");
                break;
            case 1:
                System.out.println("Grade \"B\" ");
                break;
            case 2:
                System.out.println("Grade \"C\" ");
                break;
            case 3:
                System.out.println("Grade \"D\" ");
                break;
            case 4 :
                System.out.println("Grade \"E\" ");
                break;
            case 5:
                System.out.println("Grade \"F\" ");
        }
    }
}
