/**
 * 01_area_calculator_overloading.java
 * Demonstrates compile-time polymorphism using method overloading for geometric shape area calculations.
 */
class ShapeAreaCalculator {

    // Square area: side * side
    public double area(int side) {
        return side * side;
    }

    // Rectangle area: length * breadth
    public double area(int length, int breadth) {
        return length * breadth;
    }

    // Circle area: Math.PI * radius * radius
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

class _01_area_calculator_overloading {
    public static void main(String[] args) {
        ShapeAreaCalculator calc = new ShapeAreaCalculator();

        System.out.println("--- Area Calculations (Method Overloading) ---");
        System.out.println("Area of Square (side 6): " + calc.area(6));
        System.out.println("Area of Rectangle (10 x 5): " + calc.area(10, 5));
        System.out.printf("Area of Circle (radius 4.5): %.2f\n", calc.area(4.5));
    }
}
