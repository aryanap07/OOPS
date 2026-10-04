class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class College {
    String name;
    Department department;

    College(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println(name + " has " + department.name);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department department = new Department("AI and Data Science");
        College college = new College("Engineering College", department);

        college.display();
    }
}
