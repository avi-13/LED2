package Day4.Switchs;
import java.util.Scanner;
public class Da {

    //JAVA Program to take the value from the user as input the basic salary of an employee and
//calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA =
//80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA =
//90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
        public static void main(String[] args) {
            Scanner demo= new Scanner(System.in);
            double da,hra,basic,gross;
            int temp;
            System.out.print("Enter the basic salary ");
            basic= demo.nextDouble();
            if(basic <= 10000)
            {
                temp=1;
            }
            else if(basic <= 20000)
            {
                temp=2;
            }
            else
            {
                temp=3;
            }
            switch (temp){
                case 1:
                    da  = basic * 0.8;
                    hra = basic * 0.2;
                    break;
                case 2:
                    da  = basic * 0.9;
                    hra = basic * 0.25;
                    break;
                default:
                    da  = basic * 0.95;
                    hra = basic * 0.3;
                    break;
            }
            gross = basic + hra + da;
            System.out.println("The gross salary is Rs."+gross);
        }
    }
