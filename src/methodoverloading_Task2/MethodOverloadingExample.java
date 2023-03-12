
/*Write a Java program that demonstrates method overloading with two methods named "print" - one for printing an
integer and the other for printing a string.*/
package methodoverloading_Task2;

import java.util.Scanner;

public class MethodOverloadingExample {



    public static void print(int number) {
        System.out.println("The number is: " + number);
    }

    public static void print(String message) {
        System.out.println("The message is: " + message);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Taking input
        int number = read.nextInt();
        int message = read.nextInt();

        print(number);
        print(message);
    }
}