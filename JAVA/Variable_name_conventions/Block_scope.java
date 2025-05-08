public class Block_scope {
    public static void main(String[] args) {
        int x = 10;
        
        if (x == 5){ // Bloch start here
           int y = 10; // y has block scope within if statement
            System.out.println(y); // y canbe accessed here
        } // Block end here
        System.out.println(x); // x can still be accessed here
       // System.out.println(y); // y cannot be accessed here 
    }
}
