public class printf_method {
    public static void main(String[] args) {
        // Formating output usinf the printf() method
        //Example 1
        int age = 23;
        String name = "Amardeep";
        System.out.printf("My name is %s and I am %d years old ", name , age);
        
        System.out.println(" ");
        //Example 2 : Floating point number with Two decimal place
        double price = 12.3457;
        System.out.printf("The price is $%.2f", price);

        System.out.println(" ");
        //Example 3 
        System.out.printf("|%10d|",5);
    }
}
