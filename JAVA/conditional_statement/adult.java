package conditional_statement;

import java.util.Scanner;

public class adult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age = ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are an Adult.");
        } else {
            System.out.println("you are an not Adult.");
        }
    }
}
