class Laptop {
    String model;

    Laptop(String model) {
        this.model = model;
    }

    void display() {
        System.out.println(model);
    }
}

public class Instances {
    public static void main(String[] args) {
        Laptop first = new Laptop("Model A");
        Laptop second = new Laptop("Model B");

        first.display();
        second.display();
    }
}
