// print positve number by taking number from user
import java.util.Scanner;

public class Do_while2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num ; 
        do{
            System.out.print("Enter Positive number: ");
            num = input.nextInt();
            if (num < 0) {
                System.out.println("The number is negative, please enter positive number ");
            }
        }while(num <= 0);
        System.out.println("Thank you");
    }
}
