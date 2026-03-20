package Task03;
abstract class Shape{
    abstract double calculateArea();
}

class Circle extends Shape
{
    double rad;
    Circle(double radius) {
        this.rad = radius;
    }

    double calculateArea() {
        return Math.PI * rad * rad;
    }
}

class Rectangle extends Shape {
    double len, wid;

    Rectangle(double length, double width) {
        this.len = length;
        this.wid = width;
    }

    double calculateArea() {
        return len*wid;
    }
}
public class Graphics
{
    public static void main(String[] args) {
        Shape s1 = new Circle(3.3);
        Shape s2 = new Rectangle(4.5, 5.5);

        System.out.println("Circle Area: " + s1.calculateArea());
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}
