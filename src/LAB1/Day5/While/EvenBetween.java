package LAB1.Day5.While;

public class EvenBetween {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 30){
        System.out.println(i);
            i+=2;
    }
    }
}


class CountEvenNo{
    public static void main(String[] args) {
        int i=10 ;
        int count = 0;
        while(i<=30){
            if (i % 2 == 0) {
                count += 1;
            }
            i++;

        }
        System.out.println("The total no of even no between 10 to 30 is :\t"+count);
    }
}
