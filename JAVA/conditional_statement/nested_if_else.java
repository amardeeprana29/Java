package conditional_statement;

import java.util.Scanner;

// Nested if-else statement
public class nested_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age = ");
        int age = input.nextInt();

        if(age >= 18){
            if(age >= 21){
                System.out.println("You can legally drink alcholo.");
            } else{
                System.out.println("You can vote, but not drink alcholo.");
            }
        } else {
            System.out.println("You are not old enough to vote or drink alcohol. ");
        }
    }
    
}
