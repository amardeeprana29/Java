package Operators;

public class comparison {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 10;
        System.out.println(x == y);  // false
        System.out.println(x == z);  // true
        System.out.println(x != y); // true
        System.out.println(x > y );
        System.out.println(x < y);
        System.out.println(y >= x); // y is greater but not equal to x
        System.out.println(x <= z); // x is not smaller but equal to z
    }
}
