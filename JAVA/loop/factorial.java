import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
      System.out.println("A 'for' loop that calculate the factotial of a given number: "); 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The number : ");
        int num = input.nextInt();
        

        //int num = 5;

        int factorial = 1;
        for(int i = num; i>=1; i--){
            factorial = factorial*i; // factorial *= i;
        }
    //System.out.printf("Number %d of Factorial is (%d!) = %d " , num ,num, factorial);

    System.out.println("The factorial of " + num + " is (" + num + "!) = " + factorial);

    input.close(); // Always close the scanner good for big program
    } 
}
