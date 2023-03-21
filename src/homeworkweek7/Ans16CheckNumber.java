package homeworkweek7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Ans16CheckNumber {
    /**
     * Create a main method with scanner method inside tp get a number as an input,
     * and call instance method into main method.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any number : ");
        int number = sc.nextInt();
        Ans16CheckNumber obj = new Ans16CheckNumber();
        obj.num(number);
    }

    /**
     * Create an instance method with if-else statement inside
     * to define condition of number.
     */
    public void num(int number) {

        if (number < 0) {
            System.out.println("Entered number is negative");
        } else if (number == 0) {
            System.out.println("Entered Number is Zero");
        } else {
            System.out.println("Entered number is positive");
        }

    }

}

