package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Uygulama başladı.");
        logger.log("Bu bir bilgi mesajıdır.");

        // Programın sonunda veya ihtiyaç duyulduğunda close() metodunu çağırmak iyi bir uygulamadır
        logger.close();
    }
}
