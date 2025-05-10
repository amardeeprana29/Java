import java.util.Scanner;    // import statement use the scanner class

public class takinginput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // declaration of taking input

        //String
        System.out.print("Enter your name: ");
        String name = input.nextLine();  // string --> nextLine();
        System.out.println("Hello, " +name);

        //Integer
        System.out.print("Enter your age: ");
        int age = input.nextInt();   // int --> nextInt();
        System.out.println("Your age: " + age);

        //Double
        System.out.print("Enter your number: ");
        double num = input.nextDouble();  // double --> nextDouble();
        System.out.println("you enter: " + num);

        //Float
        System.out.print("Enter your Weight: ");
        float weight = input.nextFloat();  // float --> nextFloat();
        System.out.println("your Weight: " + weight);
    }
}
