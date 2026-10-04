class Calculator {
    int add(int first, int second) {
        return first + second;
    }

    double add(double first, double second) {
        return first + second;
    }

    int add(int first, int second, int third) {
        return first + second + third;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10.5, 20.5));
        System.out.println(calculator.add(10, 20, 30));
    }
}
