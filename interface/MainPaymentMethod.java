class MainPaymentMethod {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
        CreditCard c = new CreditCard();
        c.pay();
        Wallet w = new Wallet();
        w.pay();
    }
}