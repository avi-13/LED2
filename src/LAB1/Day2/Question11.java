import java.util.Scanner;

//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side of square:");
        int a= scanner.nextInt();
        int areaofsqr=a*a;
        System.out.println("The area of square is:"+areaofsqr);
        int periofsqr=4*a;
        System.out.println("The perimeter of square is:"+periofsqr);

        System.out.println("\n");

        System.out.println("Enter principle:");
        int p= scanner.nextInt();
        System.out.println("Enter rate:");
        int r= scanner.nextInt();
        System.out.println("Enter time:");
        int t= scanner.nextInt();
        double SI=(p*t*r)/100;
        System.out.println("The SI unit is:"+SI);

        System.out.println("\n");

        System.out.println("Enter length of triangle:");
        int len= scanner.nextInt();
        System.out.println("Enter breadth of triangle:");
        int bre= scanner.nextInt();
        double areaoftri=0.5*(len*bre);
        System.out.println("The area of triangle is:"+areaoftri);

        System.out.println("\n");

        System.out.println("Enter length of cube:");
        int lent= scanner.nextInt();
        int volofcube=lent*lent*lent;
        System.out.println("The volume of cube is:"+volofcube);

        System.out.println("\n");

        System.out.println("Enter length of cuboid:");
        int l= scanner.nextInt();
        System.out.println("Enter breadth of cuboid:");
        int b= scanner.nextInt();
        System.out.println("Enter height of cuboid:");
        int h= scanner.nextInt();
        int volofcuboid=l*b*h;
        System.out.println("The volume of cuboid is:"+volofcuboid);


    }
}
