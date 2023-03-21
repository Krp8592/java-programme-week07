package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Ans07SalaryAndSales {
    /**
     * Create a main method with defining scanner statement inside,
     * and call static method into main method
     * * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide salesID : ");
        double salesID = sc.nextDouble();
        System.out.print("Provide seller's name : ");
        String sellerName = sc.next();
        System.out.print("Provide amount of sale : ");
        double salesAmount = sc.nextDouble();
        System.out.print("Provide basic salary : ");
        double basicSalary = sc.nextDouble();
        commission(salesAmount, basicSalary);

        sc.close();
    }

    /**
     * Create a static method with defining if-else statement;
     * to store the condition into variable for commission.
     *
     * @param salesAmount
     * @param basicSalary
     */
    public static void commission(double salesAmount, double basicSalary) {

        double com;

        if (salesAmount >= 50000) {
            com = (basicSalary * 35) / 100;
            System.out.println("Commission is : " + com);
        } else if (salesAmount >= 30000 && salesAmount <= 50000) {
            com = (basicSalary * 20) / 100;
            System.out.println("Commission is : " + com);
        } else if (salesAmount >= 20000 && salesAmount <= 30000) {
            com = (basicSalary * 10) / 100;
            System.out.println("Commission is : " + com);
        } else if (salesAmount >= 10000 && salesAmount <= 20000) {
            com = (basicSalary * 5) / 100;
            System.out.println("Commission is : " + com);
        } else if (salesAmount < 10000) {
            com = (basicSalary * 2) / 100;
            System.out.println("Commission is : " + com);
        } else {
            System.out.println("Commission is not applicable.");
        }
    }
}