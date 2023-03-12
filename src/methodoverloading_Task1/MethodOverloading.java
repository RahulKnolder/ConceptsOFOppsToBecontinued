
/*Write a Java program that demonstrates method overloading with two methods named "add" - one for adding two
 integers and the other for adding three integers.*/

package methodoverloading_Task1;

import java.util.Scanner;

public class MethodOverloading {

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int add(int numberOne, int numberTwo, int numberThree) {
        return numberOne + numberTwo + numberThree;
    }

    public static void main(String[] args) {


        Scanner scaner_object = new Scanner(System.in);

        int num_one = scaner_object.nextInt();
        int num_two = scaner_object.nextInt();
        int num_three = scaner_object.nextInt();


        int result1 = add(num_one, num_two);
        int result2 = add(num_one, num_two, num_three);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

}
