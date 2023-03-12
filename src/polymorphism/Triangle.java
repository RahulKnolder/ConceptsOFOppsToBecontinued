package polymorphism;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public void draw() {
        // implementation to draw a triangle
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }
}