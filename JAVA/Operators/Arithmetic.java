package Operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 75;
        int b = 25;
        int c = 23;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % c;
        System.out.println("addition = " + sum);
        System.out.println("Subtraction = " +sub);
        System.out.println("Muliplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Reminder = " + rem);

        // Operator precedence :- PEMDAS

        int p = 10;
        int q = 20;
        int s = 30;
        int h = (p + q) * s;
        System.out.println(h);
    }
}
