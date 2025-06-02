package Method;

public class sum {
    public static void main(String[] args) {
        int sum = sumNumbers(4, 5);

        System.out.println("Sum of a and b is : " +sum);
    }

    // method of block code use for sum
    public static int sumNumbers(int a, int b){
        int result = a + b;
        return result;
    }
    
}
