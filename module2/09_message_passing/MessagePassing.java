class Calculator {
    int add(int first, int second) {
        return first + second;
    }
}

public class MessagePassing {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        System.out.println(result);
    }
}
