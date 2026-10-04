class StudentRecord {
    String name;
    int marks;

    void display() {
        System.out.println(name + " scored " + marks);
    }
}

public class ProceduralVsOOP {
    static void proceduralDisplay(String name, int marks) {
        System.out.println(name + " scored " + marks);
    }

    public static void main(String[] args) {
        proceduralDisplay("Aman", 85);

        StudentRecord student = new StudentRecord();
        student.name = "Aman";
        student.marks = 85;
        student.display();
    }
}
