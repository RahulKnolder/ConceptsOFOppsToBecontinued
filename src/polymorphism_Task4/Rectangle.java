package polymorphism_Task4;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        // implementation to draw a rectangle
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}