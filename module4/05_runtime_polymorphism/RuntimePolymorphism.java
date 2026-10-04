class Payment {
    void pay() {
        System.out.println("Generic payment.");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI.");
    }
}

class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through card.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Payment payment;

        payment = new UPI();
        payment.pay();

        payment = new Card();
        payment.pay();
    }
}
