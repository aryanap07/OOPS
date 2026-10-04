interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing report.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Report report = new Report();
        report.print();
    }
}
