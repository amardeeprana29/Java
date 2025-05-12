package conditional_statement;

import java.util.Scanner;

public class positiveno {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter Number = ");
     int number = input.nextInt();
    
       if(number > 0){
            System.out.println("The number is positive");
        } else if(number < 0){
            System.out.println("The number is negative");
        } else{
            System.out.println("The number is zero");
        }
    }
}
