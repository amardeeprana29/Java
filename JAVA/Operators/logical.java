package Operators;

public class logical {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = -4;

        // AND operator : Both are true then result gives True
        System.out.println(a > 0 && b > 0);

        //OR operator : one of them true then result gives true
        System.out.println(a > 0 || c > 0); // a is true but c is not true 

        // NOT operators : give oposite result
        System.out.println( !(b > 0));
        System.out.println( !(c > 0));

        // Order of precedence : NOT > AND > OR
    }
}
