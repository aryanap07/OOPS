class Car {
    String color;
    int speed;

    void accelerate() {
        speed += 10;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}

public class ObjectModel {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Blue";
        car.speed = 40;
        car.accelerate();
        car.display();
    }
}
