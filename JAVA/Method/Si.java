package Method;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {

        // you can initalize one by one 
        /*double principal = 5000;
        double rate = 10;
        float time = 5f; */

        // yoou can initailize by looping 
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 2; i++){  // for 2 time calculation
            System.out.print("Enter Principal: ");
            double principal = input.nextDouble();

            System.err.print("Enter rate: ");
            double rate = input.nextDouble();

            System.out.print("Enter Time: ");
            double time = input.nextDouble();
           
        double Calculate_Simple_interest = CalculateSI(principal, rate, time);

        System.out.println(Calculate_Simple_interest); 
        } 

        //you can also initialize by these
       /*  double principal1 = 5000;
        double rate1 = 10;
        float time1 = 5f;
        
        double principal2 = 3250;
        double rate2 = 7;
        float time2 = 3f;
        
        double Calculate_Simple_interest1 = CalculateSI(principal1, rate1, time1);
        double Calculate_Simple_interest2 = CalculateSI(principal2, rate2, time2);

        System.out.println(Calculate_Simple_interest1);
        System.out.println(Calculate_Simple_interest2); */
    }
    // Simple Interest Block code
    public static double CalculateSI(double principal, double rate, double time){
        double Simple_Interest = (principal * rate * time / 100);
        return Simple_Interest;
    }
}
