class MathUtility {
    static int square(int value) {
        return value * value;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(MathUtility.square(7));
    }
}
