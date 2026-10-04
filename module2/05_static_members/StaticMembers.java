class Student {
    static String college = "JEC";
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Student first = new Student("Aman");
        Student second = new Student("Riya");

        first.display();
        second.display();

        Student.college = "Engineering College";

        first.display();
        second.display();
    }
}
