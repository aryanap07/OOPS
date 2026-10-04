public class ThrowExample {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }

        System.out.println("Valid age.");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
