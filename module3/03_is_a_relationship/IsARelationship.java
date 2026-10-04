class Vehicle {
    void move() {
        System.out.println("Vehicle moves.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives.");
    }
}

public class IsARelationship {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.drive();
    }
}
