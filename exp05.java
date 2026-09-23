class Payment {
    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs." + amount);
    }

    void makePayment(double amount, String method) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Method: " + method);
    }

    void makePayment(double amount, String method, String transactionId) {
        System.out.println("Payment Amount: Rs." + amount);
        System.out.println("Payment Method: " + method);
        System.out.println("Transaction ID: " + transactionId);
    }
}

class UPIPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment of Rs." + amount + " successful.");
    }
}

public class exp05 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();

        System.out.println("Compile-Time Polymorphism");
        System.out.println("-------------------------");
        upi.makePayment(500.0);
        upi.makePayment(1000.0, "Credit Card");
        upi.makePayment(1500.0, "Net Banking", "TXN12345");

        System.out.println("\nRuntime Polymorphism");
        System.out.println("--------------------");
        Payment payment = new UPIPayment();
        payment.makePayment(2000.0);
    }
}
