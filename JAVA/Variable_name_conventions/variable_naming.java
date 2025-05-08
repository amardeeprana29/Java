package Variable_name_conventions;

public class variable_naming {
    public static void main(String[] args) {
        //It is easy to declare but not easily to remember  
        int x = 10, y = 20 , z = 30;
        int a = x + y + z;
        System.out.println("sum = " +a); 

        // it is easily to remember
        int count = 10, price = 20, total = 30;
        int grandTotal = count + price + total;
        System.out.println("grandTotal = " +grandTotal);
    }
}
