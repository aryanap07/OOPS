class Person {
    String name;

    void speak() {
        System.out.println(name + " is speaking.");
    }
}

public class ElementsOfOOP {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Aman";
        person.speak();
    }
}
