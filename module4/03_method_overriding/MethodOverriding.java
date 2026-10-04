class Animal {
    void sound() {
        System.out.println("Animal sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
