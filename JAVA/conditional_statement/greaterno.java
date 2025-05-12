package conditional_statement;

import java.util.Scanner;

// Ladder if else example 
public class greaterno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number x = ");
        int x = input.nextInt();
        System.out.print("Enter 2nd numbers y = ");
        int y = input.nextInt();

        if(x > y){
            System.out.println("x is greater than y");
        } else if( x < y ){
            System.out.println("Y is greater than x");
        } else {
            System.out.println("Both are equal numbers");
        }
    }
}
