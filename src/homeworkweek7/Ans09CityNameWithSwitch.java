package homeworkweek7;

import java.util.Scanner;

/**
 * Same as program-8 using switch statement.
 */

public class Ans09CityNameWithSwitch {

    /**
     * Create a main method with scanner statement and store an input,
     * with  a variable and change the type of stored variable into character
     * call static method into main method
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide any alphabet : ");
        String city = scanner.next();
        char c = city.toUpperCase().charAt(0);
        city1(c);

        scanner.close();
    }

    /**
     * Create static method with parameters
     * and use parameter to store value using switch statement of cities
     * as per alphabets.
     *
     */
    public static void city1(char c) {


        switch (c) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bali");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Eastbourne");
                break;
            case 'F':
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
