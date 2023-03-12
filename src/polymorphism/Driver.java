package polymorphism;

public class Driver {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
