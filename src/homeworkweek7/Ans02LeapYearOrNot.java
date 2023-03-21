package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Ans02LeapYearOrNot {
    // Declare a main method.
    public static void main(String[] args) {
        // Define a scanner statement to input any year in the program
        Scanner year = new Scanner(System.in);
        // Create a print statement.
        System.out.print("Provide any Year : ");
        // Create a variable to store any year in memory
        int a = year.nextInt();
        // object creation to call instance method.
        Ans02LeapYearOrNot obj = new Ans02LeapYearOrNot();
        //Calling instance via object.
        obj.leapYear(a);

        year.close();
    }

    //Create an instance
    public void leapYear(int a) {
        //Declare if and else statement to define conditions for leap year
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            System.out.println(a + " is a leap year.");
        } else {
            System.out.println(a + " is not a leap year.");
        }

    }
}


