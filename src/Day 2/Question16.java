import java.util.Scanner;

// If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//    write a program to calculate his total marks and percentage marks.
public class Question16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="Robert";
        System.out.println("This is marks of  "+name);
        System.out.println("Enter marks in Maths:");
        double math= scanner.nextDouble();
        System.out.println("Enter marks in Science:");
        double sci= scanner.nextDouble();
        System.out.println("Enter marks in Nepali:");
        double nep= scanner.nextDouble();

       double total=math+sci+nep;
        System.out.println("The total marks is:"+total);
        double percentage= (total/4);
        System.out.println("The total percentage is:"+percentage);

    }
}
