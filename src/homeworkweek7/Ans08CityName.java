package homeworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Ans08CityName {
    /**
     * create a main method and call static method into main method;
     * and use scanner statement to get input as an alphabet
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Input any Alphabet : ");
        char city = sc.next().charAt(0);
        cityName(city);

        sc.close();
    }

    /**
     * Create static method and define if else statement for
     * storing the city as per alphabet using different coditions
     *
     */
    public static void cityName(char city) {

        if (city == 'A' || city == 'a') {
            System.out.println("Ahmedabad");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bali");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chennai");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Delhi");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Eastbourne");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Fatehpur");
        } else {
            System.out.println("Invalid entry..!!");
        }

    }
}
