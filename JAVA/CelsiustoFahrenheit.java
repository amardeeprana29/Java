package Method;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
    /*   Implement a program to convert temperature from Fahrenheit to Celsius degree by using the formula 
    given below and display the converted value. C = ((F-32)/9)*5 where, C represents temperature in Celsius and F 
     represents temperature in Fahrenheit.  */

        int F1 = 32;
        int F2 = 50;

        float C1 = ((F1-32)/9)*5f;
        float C2 = ((F2-32)/9)*5f;

        System.out.println(C1);
        System.out.println(C2);

    }
}
