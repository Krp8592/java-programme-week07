package homeworkweek7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Ans10CalculationOfTwoNumbers {

    /**
     * Create a main method with scanner method inside to get an input
     * which can be stored as variables;
     * And call static method into main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        double n1 = sc.nextDouble();
        System.out.print("Input second number : ");
        double n2 = sc.nextDouble();
        System.out.print("Input arithmetic symbol : ");
        String s1 = sc.next();
        method(n1, n2, s1);

        sc.close();
    }

    /**
     * Create a static method with parameters to use them in if-else statement;
     * to store different arithmetic calculation into their symbols
     *
     * @param n1
     * @param n2
     * @param s1
     */

    public static void method(double n1, double n2, String s1) {


        if (s1.equals("+")) {
            double ans = n1 + n2;
            System.out.println("Your answer is " + ans);
        } else if (s1.equals("*")) {
            double ans = n1 * n2;
            System.out.println("Your answer is " + ans);
        } else if (s1.equals("-")) {
            double ans = n1 - n2;
            System.out.println("Your answer is " + ans);
        } else if (s1.equals("/")) {
            double ans = n1 / n2;
            System.out.println("Your answer is " + ans);
        } else {
            System.out.println("Invalid Entry ");
        }

    }
}
