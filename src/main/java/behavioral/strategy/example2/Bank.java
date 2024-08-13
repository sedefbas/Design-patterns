package behavioral.strategy.example2;

public class Bank {
    // YapiKrediStrategy.java
    public class YapiKrediStrategy implements PaymentStrategy {
        private String accountNumber;

        public YapiKrediStrategy(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Yapı Kredi. Account: " + accountNumber);
        }
    }

    // IsBankasiStrategy.java
    public class IsBankasiStrategy implements PaymentStrategy {
        private String accountNumber;

        public IsBankasiStrategy(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using İş Bankası. Account: " + accountNumber);
        }
    }

    // HalkBankasiStrategy.java
    public class HalkBankasiStrategy implements PaymentStrategy {
        private String accountNumber;

        public HalkBankasiStrategy(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Halk Bankası. Account: " + accountNumber);
        }
    }

}
