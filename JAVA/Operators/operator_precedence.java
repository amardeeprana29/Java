package Operators;

public class operator_precedence {
    public static void main(String[] args) {
        int x = 5 + 3 * 2;
        int a = 2 + 3 * 4;
        int b =  (2 + 3)*4;  
        int c = -2 * 3;  //result in negative
        int d = 2 + 3 - 4; // same level so Left to Right
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
