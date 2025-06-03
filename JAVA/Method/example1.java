package Method;
// void and non-void method
public class example1 {
    public static void main(String[] args) {

        // void method 
        add(10, 20);

        // non void method
        int sum = addNumber(5, 10);
        System.out.println(sum);

        printmessage("Amardeep");
    }
        // void method 
    public static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
        // Non-void method 
    public static int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void printmessage(String message){
        System.out.println(message);
    }

   /*  public static int multiply(int a, int b){
        int result = a + b;  
        // missing return not complie
    }*/
    
}
