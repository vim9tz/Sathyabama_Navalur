/**
 * 08_abstract_shape_hierarchy.java
 * Demonstrates Abstraction using an abstract class with abstract and concrete methods.
 */
abstract class AbstractShape {
    String color;

    AbstractShape(String color) {
        this.color = color;
    }

    // Abstract method (no body)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method
    public void displayShapeInfo() {
        System.out.println("Shape Color: " + color + " | Area: " + calculateArea() + " | Perimeter: " + calculatePerimeter());
    }
}

class ConcreteCircle extends AbstractShape {
    double radius;

    ConcreteCircle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class ConcreteRectangle extends AbstractShape {
    double length, breadth;

    ConcreteRectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class _08_abstract_shape_hierarchy {
    public static void main(String[] args) {
        AbstractShape s1 = new ConcreteCircle("Red", 5.0);
        AbstractShape s2 = new ConcreteRectangle("Blue", 8.0, 4.0);

        System.out.println("--- Abstract Shape Hierarchy ---");
        s1.displayShapeInfo();
        s2.displayShapeInfo();
    }
}
