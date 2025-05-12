package Operators;

public class assignment {
    public static void main(String[] args) {
        int x = 6; // Assign the value to x
        x += 3;  // x = x + 3 = 9
        System.out.println(x);
        x -= 2;  // x = x - 2 = 7
        System.out.println(x);
        x *= 6;  // x = x * 6 = 42
        System.out.println(x);
        x /= 7;  // x = x / 7 = 6
        System.out.println(x);

        // Also use in string

        String name = "Amardeep";
        name += " Rana"; // name = name + Rana = Amardeep Rana
        System.out.println(name);

        // Also use in double

        double num = 3.14;
        num *= 2;
        System.out.println(num);
        
    }
}
