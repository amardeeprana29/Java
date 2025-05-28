import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = -1;
        while (age < 0) {
            System.out.print("Enter Your age: ");
            age = input.nextInt();
            if (age <= 0) {
                System.out.println("Invalid age, please enter a positive values");
            }
        }
    }  
}
