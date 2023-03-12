
/*You are building a student grading system in Java. The system needs to store the grades for each student.
How would you use encapsulation to ensure that the grades can only be accessed and modified by authorized code?
 */

package Inscpulation_2Task8;

import java.util.Scanner;

public class Student {
    private String name;
    private int grade;
    private int authrorizedCode;

    public Student(String name, int grade, int authrorizedCode) {
        this.name = name;
        this.grade = grade;
        this.authrorizedCode = authrorizedCode;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    private void setGrade(int grade) {

    }

    public void updateGrade(int newGrade, int authrorizedCode) {
        if (authrorizedCode == this.authrorizedCode) {
            this.grade = newGrade;
            setGrade(newGrade);
        } else {
            System.out.println("Worong authrozation Code is wrong");
        }
        // Here you can add any necessary logic to validate that the new grade is within a certain range, etc.

    }

    public static void main(String[] args) {
        Scanner readDetails = new Scanner(System.in);


        //user input
        System.out.println("enter name ");
        String name = readDetails.nextLine();

        System.out.println("enter grade");
        int grade = readDetails.nextInt();

        System.out.println("enter authrozation code");
        int UthrozationCode = readDetails.nextInt();

        Student student = new Student(name, grade, UthrozationCode);

        // Retrieve the student's name and grade using getter methods
        String studentName = student.getName();
        int studentGrade = student.getGrade();

        System.out.println(studentName + "'s grade is " + studentGrade);

        // Update the student's grade uing the authorization code
        System.out.println("enter modified grade");
        int modifiedGrade = readDetails.nextInt();
        System.out.println("enter authorization code");
        int auth = readDetails.nextInt();

           //invoking update grade method
        student.updateGrade(modifiedGrade, auth);

        // Retrieve the updated grade using a getter method
        studentGrade = student.getGrade();
        System.out.println(studentName + "'s grade has been updated to " + studentGrade);
    }
}
