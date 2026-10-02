class Calculator {
    double area(double length, double breadth) {
        return length * breadth;
    }
    double area(int side) {
        return side * side;
    }
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Area of Rectangle = " + c.area(10.0, 5.0));
        System.out.println("Area of Square = " + c.area(5));
        System.out.println("Area of Circle = " + c.area(7.0));
    }
}