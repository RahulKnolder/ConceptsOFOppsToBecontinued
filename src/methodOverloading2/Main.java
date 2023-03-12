package methodOverloading2;

public class Main {


    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(10.0, 20.0);

        System.out.println("Area of circle: " + shape1.area()); // Area of circle: 78.53981633974483
        System.out.println("Area of rectangle: " + shape2.area()); // Area of rectangle: 200.0
    }
}
