package behavioral.strategy.example2;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Yapı Kredi Ödeme
        PaymentStrategy yapiKredi = new YapiKrediStrategy("YK12345678");
        cart.setPaymentStrategy(yapiKredi);
        cart.checkout(100);

        // İş Bankası Ödeme
        PaymentStrategy isBankasi = new IsBankasiStrategy("IS87654321");
        cart.setPaymentStrategy(isBankasi);
        cart.checkout(200);

        // Halk Bankası Ödeme
        PaymentStrategy halkBankasi = new HalkBankasiStrategy("HB56789012");
        cart.setPaymentStrategy(halkBankasi);
        cart.checkout(300);
    }
}
