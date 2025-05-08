public class Global_scope {
    public static int x = 10 ; // x has Global scope
    public static void main(String[] args) {
        System.out.println(x); // x can be accessed here
    }

    public static void somemethod() {
        System.out.println(x); // x can also be accessed here
    }
}
