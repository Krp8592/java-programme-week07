package homeworkweek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Ans12InputRecognition {

    /**
     * Create a main method with scanner statement to get input of number,
     * symbol and alphabet and store them into a char variable.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give any input :  ");
        char x = scanner.next().charAt(0);
        program(x);

        scanner.close();
    }

    /**
     * Create a static method to store the value of char parameter using
     * if else condition with print statement
     *
     * @param x
     */
    public static void program(char x) {

        if ((x >= 'a' && x <= 'b') || (x >= 'A' && x <= 'b')) {
            System.out.println("\nIt is an Alphabet");
        } else if (x >= '0' && x <= '9') {
            System.out.println("\nIt is a Number.");
        } else {
            System.out.println("\nIt is a symbol.");
        }

    }

}
