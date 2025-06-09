package Method;
// pass by value
public class example2 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling the method, x = " + x);
        changevalue(x);
        System.out.println("After calling the method, x = " + x);
    }

    public static void changevalue(int num){
         num = num + 10;
        System.err.println("Inside the method, num = " + num);
    }
}
