package behavioral.chainOfResponsibility;

// Handler soyut sınıfı
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //handle next gibi düşünebilrisin
    public abstract void handleRequest(String issue);
}

// ConcreteHandler1: Müşteri Hizmetleri Temsilcisi
class CustomerSupport extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Simple Issue")) {
            System.out.println("Customer Support handled the issue: " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

// ConcreteHandler2: Yönetici
class ManagerSupport extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Intermediate Issue")) {
            System.out.println("Manager Support handled the issue: " + issue);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

// ConcreteHandler3: Üst Düzey Yetkili
class DirectorSupport extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Complex Issue")) {
            System.out.println("Director Support handled the issue: " + issue);
        } else {
            System.out.println("Issue could not be handled: " + issue);
        }
    }
}

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Handler nesnelerini oluştur
        SupportHandler customerSupport = new CustomerSupport();
        SupportHandler managerSupport = new ManagerSupport();
        SupportHandler directorSupport = new DirectorSupport();

        // Zinciri kur
        customerSupport.setNextHandler(managerSupport);
        managerSupport.setNextHandler(directorSupport);

        // İstekleri işle
        customerSupport.handleRequest("Simple Issue");
        customerSupport.handleRequest("Intermediate Issue");
        customerSupport.handleRequest("Complex Issue");
        customerSupport.handleRequest("Unknown Issue");
    }
}


//TODO:  Sorun: diyelim müşteri şikayeti geldiğinde, bu şikayet öncelikle müşteri hizmetleri temsilcisine (ilk handler) gider.
// Eğer temsilci sorunu çözemezse, şikayeti yöneticisine (ikinci handler) iletir. Yönetici de sorunu çözemezse,
// şikayet daha üst düzey bir yetkiliye (üçüncü handler) iletilir.
// Bu şekilde, her seviye bir sorumluluğa sahip olur ve isteğin nasıl işleneceği konusunda bir zincir oluşturulur.