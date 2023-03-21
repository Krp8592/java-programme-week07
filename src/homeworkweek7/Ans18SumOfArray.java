package homeworkweek7;

/**
 * Write a Java program to sum values of an array.
 */

public class Ans18SumOfArray {

    /**
     * Create a main method and call instance method into main method
     */
    public static void main(String[] args) {
        Ans18SumOfArray obj = new Ans18SumOfArray();
        obj.sumArray();
    }

    /**
     * Create an instance and define and Array with type of number's elements,
     * and some with for loop statement.
     */
    public void sumArray() {
        int [] ele = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;

        for (int j : ele) {
            sum = sum + j;
        }
        System.out.println("sum of all the elements of array : " + sum);
    }
}
