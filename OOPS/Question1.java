package OOPS;

public class Question1 {

    /*
     * ============================
     * 1️⃣ PAYMENT INTERFACE
     * ============================
     *
     * WHY INTERFACE?
     * - Defines a CONTRACT for all payment types
     * - Enables RUNTIME POLYMORPHISM
     * - Helps follow OPEN-CLOSED PRINCIPLE
     *
     * ALTERNATIVE:
     * - Abstract class (if we had state/fields)
     */
    interface Payment {

        // Every payment MUST validate its own details
        void validate();

        // Every payment MUST process payment differently
        void processPayment();

        /*
         * DEFAULT METHOD
         *
         * WHY default?
         * - Common behavior across all payments
         * - Avoids code duplication
         * - Child classes may override if needed
         *
         * ALTERNATIVE:
         * - Put this in abstract class instead
         */
        default void generateReceipt() {
            System.out.println("Receipt Generated Successfully");
        }
    }

    /*
     * ============================
     * 2️⃣ CREDIT CARD PAYMENT
     * ============================
     *
     * implements Payment
     * → IS-A relationship
     */
    static class CreditCardPayment implements Payment {

        /*
         * Credit card specific validation
         */
        @Override
        public void validate() {
            System.out.println("Validating credit card number, CVV, expiry date");
        }

        /*
         * Credit card specific processing
         */
        @Override
        public void processPayment() {
            System.out.println("Processing payment through Credit Card gateway");
        }
    }

    /*
     * ============================
     * 3️⃣ UPI PAYMENT
     * ============================
     */
    static class UPIPayment implements Payment {

        @Override
        public void validate() {
            System.out.println("Validating UPI ID and PIN");
        }

        @Override
        public void processPayment() {
            System.out.println("Processing payment through UPI server");
        }
    }

    /*
     * ============================
     * 4️⃣ NET BANKING PAYMENT
     * ============================
     */
    static class NetBankingPayment implements Payment {

        @Override
        public void validate() {
            System.out.println("Validating bank credentials and OTP");
        }

        @Override
        public void processPayment() {
            System.out.println("Processing payment via Net Banking portal");
        }
    }

    /*
     * ============================
     * 5️⃣ PAYMENT SERVICE (CORE)
     * ============================
     *
     * MOST IMPORTANT CLASS FOR INTERVIEW
     *
     * WHY this class?
     * - Separates BUSINESS LOGIC from PAYMENT TYPES
     * - Depends on INTERFACE, not implementation
     *
     * PRINCIPLE USED:
     * - Dependency Inversion Principle
     * - Polymorphism
     */
    static class PaymentService {

        /*
         * Accepts ANY payment type
         * (CreditCard / UPI / NetBanking / Crypto / Future)
         */
        public void makePayment(Payment payment) {

            // Runtime polymorphism happens here
            payment.validate();
            payment.processPayment();
            payment.generateReceipt();
        }
    }

    /*
     * ============================
     * 6️⃣ CRYPTO PAYMENT (NEW)
     * ============================
     *
     * PROVES OPEN-CLOSED PRINCIPLE
     *
     * We DID NOT modify:
     * - Payment interface
     * - PaymentService
     * - Existing classes
     */
    static class CryptoPayment implements Payment {

        @Override
        public void validate() {
            System.out.println("Validating crypto wallet address and network");
        }

        @Override
        public void processPayment() {
            System.out.println("Processing payment via Blockchain");
        }
    }

    /*
     * ============================
     * 7️⃣ MAIN METHOD (CLIENT)
     * ============================
     *
     * Acts as CLIENT CODE
     */
    public static void main(String[] args) {

        // Service object
        PaymentService service = new PaymentService();

        // Credit Card Payment
        Payment payment1 = new CreditCardPayment();
        service.makePayment(payment1);

        System.out.println("----------------");

        // UPI Payment
        Payment payment2 = new UPIPayment();
        service.makePayment(payment2);

        System.out.println("----------------");

        // Net Banking Payment
        Payment payment3 = new NetBankingPayment();
        service.makePayment(payment3);

        System.out.println("----------------");

        // Crypto Payment (new feature)
        Payment payment4 = new CryptoPayment();
        service.makePayment(payment4);
    }
}
