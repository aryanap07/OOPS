class Rectangle {
    double length;
    double width;

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class AttributesAndOperations {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 5;

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
