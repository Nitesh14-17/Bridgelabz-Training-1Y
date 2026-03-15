interface PaymentProcessor {
    default void refund() { System.out.println("Refund processed"); }
}