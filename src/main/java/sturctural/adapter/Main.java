package sturctural.adapter;



public class Main {

   //interface
    public interface PaymentProcessor {
        void pay(int amount);
    }

    //eski sistem
    public class OldPaymentSystem {
        public void makePayment(double amount) {
            System.out.println("Payment of $" + amount + " made using Old Payment System.");
        }
    }

    //yeni ödeme sistemi zaten implemente uyumlu varsayalım ama eskisi uymlu değil diye düşün
    public class NewPaymentSystem implements PaymentProcessor {
        @Override
        public void pay(int amount) {
            System.out.println("Payment of $" + amount + " processed using New Payment System.");
        }
    }


    // eski sistemi yeni sisteme adapte etmek için oluşturduğumuz sınıf
    public class OldPaymentAdapter implements PaymentProcessor {
        private OldPaymentSystem oldPaymentSystem;

        public OldPaymentAdapter(OldPaymentSystem oldPaymentSystem) {
            this.oldPaymentSystem = oldPaymentSystem;
        }

        @Override
        public void pay(int amount) {
            oldPaymentSystem.makePayment((double) amount);
        }
    }


}
