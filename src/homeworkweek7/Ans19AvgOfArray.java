package homeworkweek7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Ans19AvgOfArray {
    /**
     * Create main method and call static method contained and array of elements of
     * a numbers with avg formula to define avg
     *
     */
    public static void main(String[] args)
    {
        average();
    }
    public static void average()
    {
        int total = 0;
        int avg = 0;
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int j : a) {
            total = total + j;
            avg = total / a.length;
        }

        System.out.println("Avg of all elements of an array " + avg);
    }

}
