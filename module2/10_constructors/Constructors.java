class Student {
    String name;
    int marks;

    Student() {
        name = "Unknown";
        marks = 0;
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student first = new Student();
        Student second = new Student("Aman", 90);

        first.display();
        second.display();
    }
}
