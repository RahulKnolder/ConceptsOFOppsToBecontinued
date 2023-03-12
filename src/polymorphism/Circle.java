package polymorphism;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        // implementation to draw a circle
        System.out.println("Drawing a circle with radius " + radius);
    }
}