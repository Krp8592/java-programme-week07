package homeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet
 */

public class Ans03MarkSheet {
    //Create  a main method.
    public static void main(String[] args) {
        //Declare a scanner statement
        Scanner sc = new Scanner(System.in);
        //Define a print statement
        System.out.print(" Input name of the student : ");
        //Create a variable to store a value
        String name = sc.next();
        //Declare a print statement to print a message
        System.out.print(" Input roll no of the student : ");
        //Create a variable to store the value of Roll No.
        int rollNo = sc.nextInt();
        //call static method in to main method directly.
        total(name, rollNo);
        //Disable scanner statement
        sc.close();
    }

    //Declare a static method
    public static void total(String name, int rollNo) {
        //Declare a scanner class to get input in program
        Scanner sc1 = new Scanner(System.in);
        //Declare a print statement
        System.out.print(" Input marks of Maths subject : ");
        //Declare a variable
        int maths = sc1.nextInt();
        //Declare a new variable to store the value of previous variable
        int maths1 = maths;
        //Define conditions using if else
        if (maths < 0 || maths >= 100) {
            //Declare a print statement
            System.out.println("Invalid input, Enter input between 0 tp 100 ");
            //Create a print statement
            System.out.print("Input valid marks of maths : ");
            //Store value into define variable
            maths1 = sc1.nextInt();
        }
        //Declare a print statement
        System.out.print(" Input marks of Science subject : ");
        //Create a print statement
        int science = sc1.nextInt();
        //Create a variable tto store the vale of previously defined variable
        int science1 = science;
        //Define an if else condition
        if (science < 0 || science >= 100) {
            //Crete a print statement.
            System.out.println("Invalid input, Enter input between 0 tp 100 ");
            //Declare a print statement
            System.out.print("Input valid marks of science : ");
            //Declare a print statement
            science1 = sc1.nextInt();
        }
        //Declare a print statement
        System.out.print(" Input marks of English subject : ");
        //Create a variable
        int english = sc1.nextInt();
        //Create a variable
        int english1 = english;
        //Define if else condition
        if (english < 0 || english >= 100) {
            //Define a print statement
            System.out.println("Invalid input, Enter input between 0 tp 100 ");
            //Declare a print statement
            System.out.print("Input valid marks of english : ");
            //Store the value of input marks in variable.
            english1 = sc1.nextInt();

        }
        //Addition of the marks of subjects
        int sum = (maths1 + science1 + english1);
        //Declare a variable to store the percentage
        int p = (sum * 100) / (300);
        //Declare a variable
        String y;
        //Define if-else condition for result declaration
        if (p < 35) {
            y = "Fail";
        } else {
            y = "pass";
        }
        //Declare a variable
        String x;
        //Define if-else condition for grade declaration
        if (p >= 80) {
            x = "A+";
        } else if (p >= 60) {
            x = "A ";
        } else if (p >= 50) {
            x = "B ";
        } else if (p >= 35) {
            x = "C ";
        } else {
            x = "  ";
        }
        //Define print statements to display mark sheet.
        System.out.println("--------------------------------------");
        System.out.println("|              Mark Sheet            |");
        System.out.println("|____________________________________|");
        System.out.println("|   Name         :  " + name + "             |");
        System.out.println("|   Roll No      :  " + rollNo + "               |");
        System.out.println("|____________________________________|");
        System.out.println("|   Subject      :  Marks            |");
        System.out.println("|____________________________________|");
        System.out.println("|   Maths        :  " + maths1 + "               |");
        System.out.println("|   Science      :  " + science1 + "               |");
        System.out.println("|   English      :  " + english1 + "               |");
        System.out.println("|____________________________________|");
        System.out.println("|   Total        :  " + sum + "              |");
        System.out.println("|____________________________________|");
        System.out.println("|   Percentage   :  " + p + "               |");
        System.out.println("|   Result       :  " + y + "             |");
        System.out.println("|   Grade        :  " + x + "               |");
        System.out.println("|____________________________________|");
    }

}
