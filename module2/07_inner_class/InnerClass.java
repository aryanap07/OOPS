class Computer {
    class Processor {
        void display() {
            System.out.println("Processor belongs to Computer.");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        processor.display();
    }
}
