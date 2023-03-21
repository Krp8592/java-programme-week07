package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Ans06Odd0rEven {
    /**
     * Create a main method with scanner statement to store value of number;
     * and call static method into main method.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any number : ");
        double num = sc.nextDouble();
        number(num);

        sc.close();
    }

    /**
     * Declare a static method to define a if-else statement;
     * and define condition using parameters to store the value
     * which we can in main method.
     */
    public static void number(double num) {

        if (num % 2 == 0) {
            System.out.println("Given number is even.");
        } else {
            System.out.println("Given number is odd.");
        }
    }
}
