class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }

        System.out.println("Valid marks.");
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
        } catch (InvalidMarksException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
