package homeworkweek7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Ans17NumericArray {

    /**
     * Create a main method and define an Array with elements,
     * and call instance method with main method.
     */

    public static void main(String[] args) {

        int[] x = {567, 895, 456, 897, 234, 345, 389, 198, 398, 295, 742, 687, 489};
        System.out.println("Original numeric array :");
        System.out.print(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("\nSorted numeric array : " + (Arrays.toString(x)));
        Ans17NumericArray obj = new Ans17NumericArray();
        obj.words();

    }

    /**
     * Create an instance method with an array of words
     * and sort them according to the alphabetical orders.
     */
    public void words() {

        String[] b = {"Apple", "Pineapple", "Papaya", "Grapes", "Orange", "Plums", "Raspberries"};
        System.out.println("Original Strings Array : ");
        System.out.print(Arrays.asList(b));
        Arrays.sort(b);
        System.out.println("\nSorted Strings array : " + (Arrays.toString(b)));


    }


}

