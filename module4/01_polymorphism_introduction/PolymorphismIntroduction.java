class Animal {
    void sound() {
        System.out.println("Animal sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class PolymorphismIntroduction {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
