package methodOverloading2_Task4;

/*You are building a shape drawing program in Java. The program needs to draw different shapes
such as circles,rectangles, and triangles. How would you use
 polymorphism to ensure that each shape can be drawn using the same method, even though the implementation
 details are different for each shape?*/


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);

        System.out.println("enter the radius of the circle");

        Shape shape1 = new Circle(read.nextInt());


        System.out.println("enter the sides of the rectangle");
        Shape shape2 = new Rectangle(read.nextInt(), read.nextInt());

        System.out.println("Area of circle: " + shape1.area()); // Area of circle: 78.53981633974483
        System.out.println("Area of rectangle: " + shape2.area()); // Area of rectangle: 200.0
    }
}
