package homeworkweek7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Ans13DaysNameOfWeek {

    /**
     * Create a main method with scanner statement to get input as a number
     * Call Instance method into main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int day = sc.nextInt();
        Ans13DaysNameOfWeek obj = new Ans13DaysNameOfWeek();
        obj.week(day);

        sc.close();
    }

    /**
     * Create a instance method with params and use switch condition for
     * to store value of number as a day of a week  which we get as an input.
     *
     * @param day
     */
    public void week(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
