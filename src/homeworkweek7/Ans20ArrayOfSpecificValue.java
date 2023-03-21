package homeworkweek7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Ans20ArrayOfSpecificValue {
    /**
     * Create a static method with array of number
     * and define print statements
     */
    public static void main(String[] args) {
        int[] myArray = {3, 7, 4, 12, 16, 34, 23, 56, 45, 76, 89, 92};
        System.out.println(con(myArray, 89));
        System.out.println(con(myArray, 100));

    }

    //Define a static with return type with params
    public static boolean con(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}

