class Printer {
    void print(int value) {
        System.out.println("Integer: " + value);
    }

    void print(String value) {
        System.out.println("String: " + value);
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(10);
        printer.print("Hello");
    }
}
