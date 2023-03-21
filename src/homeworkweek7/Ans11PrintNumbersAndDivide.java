package homeworkweek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Ans11PrintNumbersAndDivide {

    /**
     * Create a main method and use a print statement
     * and Call static method in to main method
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.print("Numbers Divided by 3 :\n ");
        num();

    }

    /**
     * Create a static method to define  if else condition to define
     * formula for dividing range of number between 1 to 100 with 5 and 10.
     */
    public static void num() {

        for (int x = 1; x < 100; x++)
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }

        System.out.print("\n\nNumbers Divided by 5 :\n ");
        for (int x = 1; x < 100; x++)
            if (x % 5 == 0) {
                System.out.print(x + " ");
            }

    }
}