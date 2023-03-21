package homeworkweek7;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */

public class Ans14Person {
    //Define global variable
    String firstName, lastName;
    int age;


    /**
     * Create a main method and call constructor and blocks
     * with concatenation in a print statement
     * call different parans to set age with person variable.

     *
     */
    public static void main(String[] args) {
        Ans14Person person = new Ans14Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    //Define an instance method
    public void getFirstName() {
        System.out.println(firstName);
        //return firstName;
    }

    //Define an instance method
    public void getLastName() {
        System.out.println(lastName);
        // return lastName;
    }

    //Define an instance method
    public void getAge() {

        System.out.println(age);
    }

    //Define instance method with params
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    //Define instance method with params
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    //Define instance method with params
    public void setAge(int age) {

        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }

    //Define instance method with params
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    //Define instance method with params
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }
}
