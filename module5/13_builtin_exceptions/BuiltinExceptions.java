public class BuiltinExceptions {
    public static void main(String[] args) {
        try {
            int[] values = {10, 20};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid array index.");
        }

        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException exception) {
            System.out.println("Invalid number format.");
        }
    }
}
