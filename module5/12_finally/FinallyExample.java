public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try.");
            int result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Exception occurred.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
