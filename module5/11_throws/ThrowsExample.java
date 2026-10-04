import java.io.IOException;

public class ThrowsExample {
    static void readData() throws IOException {
        throw new IOException("Data could not be read.");
    }

    public static void main(String[] args) {
        try {
            readData();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
