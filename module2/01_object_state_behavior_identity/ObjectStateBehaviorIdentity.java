class Student {
    String name;
    int marks;

    void study() {
        System.out.println(name + " is studying.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ObjectStateBehaviorIdentity {
    public static void main(String[] args) {
        Student first = new Student();
        Student second = new Student();

        first.name = "Aman";
        first.marks = 80;

        second.name = "Riya";
        second.marks = 90;

        first.study();
        first.display();

        System.out.println(first == second);
    }
}
