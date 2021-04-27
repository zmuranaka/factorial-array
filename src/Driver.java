/*
File: Driver.java
Zachary Muranaka
Allows the user to calculate the factorial of very large numbers using an array
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        int number = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        try
        {
            number = input.nextInt();
        }
        // Catches if the user did not enter a valid int
        catch(InputMismatchException iException)
        {
            System.out.println("Input not valid. Try again.");
            System.exit(1); // The program ends
        }
        
        try
        {
            // Constructs a new FactorialArray object using the number provided
            FactorialArray array = new FactorialArray(number);
            System.out.print("The factorial is: ");
            System.out.println(array.getProductAsString());
            System.out.println();
        }
        catch(ArrayIndexOutOfBoundsException aiException) // The factorial is more than 100000 digits long
        {
            System.out.println("This factorial is too large to be displayed.");
            System.exit(1); // The program ends
        }

        input.close();
    }
}
