package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Ans01OddOrEven {
    // Declare a main method
    public static void main(String[] args) {
        // Create a scanner statement to provide any  number
        Scanner scanner = new Scanner(System.in);
        // Declare a print statement
        System.out.print("Input any number : ");
        // create a variable to store value as any number
        int num = scanner.nextInt();
        // call static method to main method
        number(num);

        scanner.close();
    }

    // Declare a static method with no return type with parameters
    public static void number(int num) {
        //apply a condition to define weather given number is even or odd
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        //Declare a print statement to display final answer
        System.out.println(("Given Number " + num + " is " + evenOdd));


    }

}
