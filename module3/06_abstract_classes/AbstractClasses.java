abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();
        System.out.println(circle.area());
    }
}
