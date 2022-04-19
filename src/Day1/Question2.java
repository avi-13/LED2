//Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid
public class Question2 {
    public static void main(String[] args) {
        int pri=100;
        int r=3;
        int time=2;
        int SI;
        SI=(pri*r*time)/100;
        System.out.println("The SI is:"+SI);

        int l=5;
        int b=10;
        int h=3;
        int cube,cuboid;
        double area;

        cube=l*l*l;
        cuboid=l*b*h;
        area=0.5*(b*h);
        System.out.println("The volume of Cube is:"+cube);
        System.out.println("The volume of Cuboid is:"+cuboid);
        System.out.println("The area of Triangle is:"+area);


    }
}
