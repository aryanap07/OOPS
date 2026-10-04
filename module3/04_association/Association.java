class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learnFrom(Teacher teacher) {
        System.out.println(name + " learns from " + teacher.name);
    }
}

public class Association {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Sharma");
        Student student = new Student("Aman");

        student.learnFrom(teacher);
    }
}
